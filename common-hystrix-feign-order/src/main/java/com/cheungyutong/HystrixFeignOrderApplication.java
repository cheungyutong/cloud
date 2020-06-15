package com.cheungyutong;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @Author cheungyutong
 * @Date 2020/6/13 0:12
 */
@SpringBootApplication
@Slf4j
@EnableFeignClients
@EnableCircuitBreaker//order客户端的服务降级操作
public class HystrixFeignOrderApplication {
    public static void main(String[] args) {
        SpringApplication.run(HystrixFeignOrderApplication.class, args);

        log.info("-----------------------------------------------");
        log.info("-----------------------------------------------");
        log.info("-----------------------------------------------");
        log.info("--- HystrixFeignOrderApplication start up -----");
        log.info("-----------------------------------------------");
        log.info("-----------------------------------------------");
        log.info("-----------------------------------------------");
    }

}
