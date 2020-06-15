package com.cheungyutong.service.impl;

import com.cheungyutong.entity.Payment;
import com.cheungyutong.mapper.PaymentMapper;
import com.cheungyutong.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @Author cheungyutong
 * @Date 2020/6/9 22:45
 */
@Service
public class PaymentServiceimpl implements PaymentService {

//    @Autowired
//    @Qualifier("PaymentMapper")
    @Resource
    private PaymentMapper paymentMapper;


    @Override
    public int create(Payment payment) {
        return paymentMapper.create(payment);
    }

    @Override
    public Payment getPaymentById(Long id) {
        return paymentMapper.getPaymentById(id);
    }
}
