package com.cheungyutong.serivice.impl;

import com.cheungyutong.dao.OrderDao;
import com.cheungyutong.domain.Order;
import com.cheungyutong.serivice.AccountService;
import com.cheungyutong.serivice.OrderService;
import com.cheungyutong.serivice.StorageService;
import io.seata.rm.datasource.sql.druid.oracle.OracleDeleteRecognizer;
import io.seata.spring.annotation.GlobalTransactional;
import lombok.extern.slf4j.Slf4j;
import org.checkerframework.checker.index.qual.SameLen;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Author cheungyutong
 * @Date 2020/6/19 18:03
 * 创建订单->调用库存服务扣减库存->调用账户服务扣减账户余额->修改订单状态
 * 简单说:
 * 下订单->减库存->减余额->改状态
 * GlobalTransactional seata开启分布式事务,异常时回滚,name保证唯一即可
 */
@Service
@Slf4j
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderDao orderDao;

    @Autowired
    private StorageService storageService;

    @Autowired
    private AccountService accountService;

    @Override
    @GlobalTransactional(name = "fsp-create-order", rollbackFor = Exception.class)
    public void create(Order order) {
        //1.新建订单
        log.info("******开始新建订单");
        orderDao.create(order);
        //2.扣减库存
        log.info("******订单微服务开始调用库存,做扣减数量count");
        storageService.decrease(order.getProductId(),order.getCount());
        log.info("******订单微服务开始调用库存,做扣减数量count******END");
        //3.扣减账户
        log.info("******订单微服务开始调用账户,做扣减账户money");
        accountService.decrease(order.getUserId(), order.getMoney());
        log.info("******订单微服务开始调用账户,做扣减账户money******END");
        //4.修改订单状态，从0到1，1代表已经完成
        log.info("******修改订单状态开始");
        orderDao.update(order.getUserId(), 0);
        log.info("******修改订单状态结束");

        log.info("******下订单结束,期待您收快递的日子");
    }
}
