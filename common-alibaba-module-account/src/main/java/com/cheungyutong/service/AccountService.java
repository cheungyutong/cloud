package com.cheungyutong.service;

import java.math.BigDecimal;

/**
 * @Author cheungyutong
 * @Date 2020/6/19 20:32
 * 库存服务
 */
public interface AccountService {
    /**
     * 减库存
     *
     * @param userId 用户id
     * @param money  金额
     * @return
     */
    void decrease(Long userId, BigDecimal money);
}
