package com.cheungyutong.service.impl;

import com.cheungyutong.entity.CommonResult;
import com.cheungyutong.entity.Payment;
import com.cheungyutong.service.PaymentService;
import org.springframework.stereotype.Component;

/**
 * @Author cheungyutong
 * @Date 2020/6/18 22:35
 */
@Component
public class PaymentFallbackService implements PaymentService {
    @Override
    public CommonResult<Payment> paymentSQL(Long id) {
        return new CommonResult<>(444,"服务降级返回，----PaymentFallbackService",new Payment(id,"errorserial"));
    }
}
