package com.cheungyutong.service;

/**
 * @Author cheungyutong
 * @Date 2020/6/19 20:14
 */
public interface StorageService {
    /**
     * 减库存
     *
     * @param productId
     * @param count
     * @return
     */
    void decrease(Long productId, Integer count);
}
