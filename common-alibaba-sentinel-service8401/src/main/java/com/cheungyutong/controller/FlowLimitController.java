package com.cheungyutong.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.alibaba.csp.sentinel.util.TimeUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.BlockingDeque;
import java.util.concurrent.TimeUnit;

/**
 * @Author cheungyutong
 * @Date 2020/6/17 14:29
 */
@RestController
@Slf4j
public class FlowLimitController {

    @GetMapping("/testA")
    public String testA(){
//        try {
//            Thread.sleep(2000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        return "*******testA********";
    }

    @GetMapping("/testB")
    public String testB(){
        log.info(Thread.currentThread().getName()+"\t"+"*******testB");
        return "*******testB********";
    }


    @GetMapping("/testD")
    public String testD(){
//        try {
//            //暂停几秒钟线程
//            TimeUnit.SECONDS.sleep(1);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        log.info("testD 测试RT");
        int age = 10/0 ;
        log.info("testD 异常比例");
        return "testD -----";
    }

    @GetMapping("/testE")
    public String testExceptionCount(){
        log.info("testE 异常数");
        int age = 10 /0 ;
        return "testE -----";
    }

    //热点限流,@SentinelResource，属性value是为了资源名做唯一标识,blockHandler作为兜底方法
    //在sentinel客户端配置热点规则，如果违背了，就加载降级方法
    @GetMapping("/testHotKey")
    @SentinelResource(value = "testHotKey", blockHandler = "deal_testHotKey")
    public String testHotKey(@RequestParam(value = "p1", required = false) String p1,
                             @RequestParam(value = "p2", required = false) String p2){
        return "******testHotKey";
    }

    public String deal_testHotKey(String p1, String p2, BlockException exception){
        return "******deal_testHotKey, /(ㄒoㄒ)/~~";  //sentinel系统默认的提示，Blocked by Sentinel（flow limiting）
    }
}
