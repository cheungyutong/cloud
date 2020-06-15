package com.cheungyutong.service;

import com.cheungyutong.entity.Payment;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

/**
 * @Author cheungyutong
 * @Date 2020/6/9 22:44
 */
public interface PaymentService {
    int create(Payment payment);

    Payment getPaymentById(@Param("id") Long id);

}
