package com.cheungyutong.service;

import com.cheungyutong.entity.CommonResult;
import com.cheungyutong.entity.Payment;
import feign.Contract;
import feign.Param;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.cloud.openfeign.SpringQueryMap;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * @Author cheungyutong
 * @Date 2020/6/11 22:01
 */
@Component
@FeignClient(name = "CLOUD-PROVIDER")
public interface PaymentFeignService {

    @PostMapping(value = "/payment/create")
    CommonResult<Payment> create(@SpringQueryMap Payment payment);

    @GetMapping("/payment/get/{id}")
    CommonResult<Payment> getPaymentById(@PathVariable("id") Long id);

    //模拟连接超时接口
    @GetMapping("/payment/feign/timeout")
    public String paymentFeignTimeout();


    /**
     * 解决post传输数据为null问题，配合@SpringQueryMap使用
     */
    class AuditFeiginConfig {
        @Bean
        public Contract customerContract() {
            return new feign.Contract.Default();
        }
    }
}
