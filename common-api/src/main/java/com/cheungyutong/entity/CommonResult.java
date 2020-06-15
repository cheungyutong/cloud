package com.cheungyutong.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author cheungyutong
 * @Date 2020/6/9 22:23
 * @Describe 前后端分离，那么最基本的一定有前后端传输时的数字（400，500，200），以及错误信息等
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CommonResult<T> {
    private Integer code;
    private String message;
    private Object data;

    public CommonResult(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
