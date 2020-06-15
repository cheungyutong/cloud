package com.cheungyutong.service;

import cn.hutool.core.util.IdUtil;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.UUID;
import java.util.concurrent.TimeUnit;

/**
 * @Author cheungyutong
 * @Date 2020/6/12 22:22
 */
@Service
public class PaymentService {

    /**
     * 正常访问，肯定OK
     * @param id
     * @return
     */
    public String paymentInfo_OK(Long id){
        return "线程池："+Thread.currentThread().getName()+", paymentInfo_OK,id："+id+"\t"+"哈哈哈(●'◡'●)";
    }

    /**
     * @HystrixCommand注解，fallbackMethod属性表示如果这个方法出现问题，那么paymentInfo_TimeOutHandler将会兜底
     */
    @HystrixCommand(fallbackMethod = "paymentInfo_TimeOutHandler", commandProperties = {
            @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds", value = "5000")
    })
    public String paymentInfo_TimeOut(Long id){
        //int timeNum = 10/0;
        int timeNum = 3;
        try {
            TimeUnit.SECONDS.sleep(timeNum);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "线程池："+Thread.currentThread().getName()+", paymentInfo_Timeout,id："+id+"\t"+"呜呜呜(●'^'●),  耗时"+timeNum+"秒";
    }

    public String paymentInfo_TimeOutHandler(Long id){
        return "线程池："+Thread.currentThread().getName()+", paymentInfo_TimeOutHandler,id："+id+"\t"+"哈哈哈(●'◡'●)，我们这是服务降级啦";
    }

    //服务熔断
    @HystrixCommand(fallbackMethod = "paymentCircuitBreaker_fallback", commandProperties = {
            @HystrixProperty(name = "circuitBreaker.enabled",value = "true"),//是否开启断路器
            @HystrixProperty(name = "circuitBreaker.requestVolumeThreshold",value = "10"),//请求次数
            @HystrixProperty(name = "circuitBreaker.sleepWindowInMilliseconds",value = "10000"),//时间窗口期
            @HystrixProperty(name = "circuitBreaker.errorThresholdPercentage",value = "60")//失败率达到多少后跳闸
    })
    public String paymentCircuitBreaker(@PathVariable("id") Integer id){
        if(id < 0){
            throw new RuntimeException("*****id 不能为负数");
        }
        String serialNumber = IdUtil.simpleUUID();//等同于UUID.randomUUID().toString()

        return Thread.currentThread().getName()+"\t"+"调用成功，流水号"+serialNumber;
    }

    public  String paymentCircuitBreaker_fallback(@PathVariable("id") Integer id){
        return "id 不能为负数，请稍后重试，/(ㄒoㄒ)/~~   id"+id;
    }
}
