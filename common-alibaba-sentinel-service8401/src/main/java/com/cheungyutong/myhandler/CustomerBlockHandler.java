package com.cheungyutong.myhandler;

import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.cheungyutong.entity.CommonResult;

/**
 * @Author cheungyutong
 * @Date 2020/6/18 14:03
 */
public class CustomerBlockHandler {

    public static CommonResult handlerException(BlockException exception) {
        return new CommonResult(444, "客户自定义，global handlerException---1");
    }

    public static CommonResult handlerException2(BlockException exception) {
        return new CommonResult(444, "客户自定义，global handlerException---2");
    }
}
