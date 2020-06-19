package com.cheungyutong.serivice;

import com.cheungyutong.domain.Order;
import org.springframework.stereotype.Service;

/**
 * @Author cheungyutong
 * @Date 2020/6/19 18:02
 */
public interface OrderService {
    /**
     * 创建订单
     * @param order
     */
    void create(Order order);
}
