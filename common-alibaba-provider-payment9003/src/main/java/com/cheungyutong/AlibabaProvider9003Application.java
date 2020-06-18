package com.cheungyutong;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Author cheungyutong
 * @Date 2020/6/18 16:39
 */
@SpringBootApplication
@Slf4j
@EnableDiscoveryClient
public class AlibabaProvider9003Application {
    public static void main(String[] args) {
        SpringApplication.run(AlibabaProvider9003Application.class, args);

        log.info("-----------------------------------------------");
        log.info("-----------------------------------------------");
        log.info("-----------------------------------------------");
        log.info("--- AlibabaProvider9003Application start up ---");
        log.info("-----------------------------------------------");
        log.info("-----------------------------------------------");
        log.info("-----------------------------------------------");
    }
}
