package com.cheungyutong.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @Author cheungyutong
 * @Date 2020/6/13 0:18
 * @deprecation 注意FeiClient注解后面跟的微服务名
 */
@Component
@FeignClient(value = "CLOUD-HYSTRIX-PROVIDER", fallback = PaymentFabllbackService.class)
public interface PaymentHystrixService {

    @GetMapping("/payment/hystrix/ok/{id}")
    public String paymentInfo_OK(@PathVariable("id") Long id);

    @GetMapping("/payment/hystrix/timeout/{id}")
    public String paymentInfo_TimeOut(@PathVariable("id") Long id);
}
