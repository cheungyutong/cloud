package com.cheungyutong.controller;

import com.cheungyutong.entity.CommonResult;
import com.cheungyutong.entity.Payment;
import com.cheungyutong.service.PaymentFeignService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @Author cheungyutong
 * @Date 2020/6/11 22:11
 */
@RestController
@Slf4j
public class FeignOrderController {

    @Resource
    private PaymentFeignService paymentFeignService;

    @PostMapping("/consumer/payment/create")
    public CommonResult create(Payment payment){
        CommonResult<Payment> result = paymentFeignService.create(payment);
        log.info("********插入结果"+result+"********");
        if(result.getCode() > 0){
            return new CommonResult(200, "插入数据库成功", result);
        }
        return new CommonResult(404, "插入数据库失败", null);
    }

    @GetMapping("/consumer/payment/get/{id}")
    public CommonResult<Payment> getPaymentById(@PathVariable("id") Long id){
        return paymentFeignService.getPaymentById(id);
    }

    @GetMapping("/consumer/payment/feign/timeout")
    public String paymentFeignTimeout(){
        //openfeign-ribbon，客户端一般默认等待一秒
        return paymentFeignService.paymentFeignTimeout();
    }
}
