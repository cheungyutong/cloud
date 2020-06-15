package com.cheungyutong.service;

import org.springframework.stereotype.Component;

/**
 * @Author cheungyutong
 * @Date 2020/6/13 16:44
 */
@Component
public class PaymentFabllbackService implements PaymentHystrixService{
    @Override
    public String paymentInfo_OK(Long id) {
        return "------PaymentFabllbackService fallback paymentInfo_OK, /(ㄒoㄒ)/~~-----";
    }

    @Override
    public String paymentInfo_TimeOut(Long id) {
        return "------PaymentFabllbackService fallback paymentInfo_TimeOut, /(ㄒoㄒ)/~~-----";
    }
}
