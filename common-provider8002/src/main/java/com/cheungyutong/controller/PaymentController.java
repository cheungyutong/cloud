package com.cheungyutong.controller;

import com.cheungyutong.entity.CommonResult;
import com.cheungyutong.entity.Payment;
import com.cheungyutong.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @Author cheungyutong
 * @Date 2020/6/9 22:55
 */
@Slf4j
@RestController
public class PaymentController {

    @Resource
    private PaymentService paymentService;

    @Value("${server.port}")
    private String serverPort;

    @PostMapping(value = "/payment/create")
    public CommonResult<Payment> create(Payment payment){
        int result = paymentService.create(payment);
        log.info("********插入结果"+result+"********");
        if(result > 0){
            return new CommonResult(200, "插入数据库成功,serverPort:"+serverPort, result);
        }
        return new CommonResult(404, "插入数据库失败,serverPort:"+serverPort, null);
    }

    @GetMapping(value = "/payment/get/{id}")
    public CommonResult<Payment> getPaymentById(@PathVariable("id") Long id){
        Payment payment = paymentService.getPaymentById(id);
        log.info("********查询结果"+payment+"********");
        if(payment != null){
            return new CommonResult(200, "查询数据库成功,serverPort:"+serverPort, payment);
        }
        return new CommonResult(404, "查询数据库失败,serverPort:"+serverPort, null);
    }

    @GetMapping("/payment/lb")
    public String getPaymentLB(){
        return serverPort;
    }
}
