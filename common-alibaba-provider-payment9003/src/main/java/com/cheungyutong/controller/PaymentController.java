package com.cheungyutong.controller;

import cn.hutool.core.util.IdUtil;
import com.cheungyutong.entity.CommonResult;
import com.cheungyutong.entity.Payment;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author cheungyutong
 * @Date 2020/6/18 16:45
 */
@RestController
public class PaymentController {

    @Value("${server.port}")
    private String serverPort;

    //模拟数据库
    public static Map<Long , Payment> hashMap = new HashMap<>();
    static {
        hashMap.put(1L,new Payment(1L, IdUtil.simpleUUID()));
        hashMap.put(2L,new Payment(2L, IdUtil.simpleUUID()));
        hashMap.put(3L,new Payment(3L, IdUtil.simpleUUID()));
    }

    @GetMapping("/paymentSQL/{id}")
    public CommonResult<Payment> paymentSQL(@PathVariable("id") Long id){
        Payment payment = hashMap.get(id);
        return new CommonResult<>(200, "from mysql,serverPort:" + serverPort, payment);
    }
}
