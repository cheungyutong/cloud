package com.cheungyutong;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * @Author cheungyutong
 * @Date 2020/6/16 16:56
 */
@SpringBootApplication
@EnableDiscoveryClient
@Slf4j
@EnableScheduling
public class AlibabaProvider9001Application {
    public static void main(String[] args) {
        SpringApplication.run(AlibabaProvider9001Application.class, args);

        log.info("-----------------------------------------------");
        log.info("-----------------------------------------------");
        log.info("-----------------------------------------------");
        log.info("---- NacosProvider9001Application start up ----");
        log.info("-----------------------------------------------");
        log.info("-----------------------------------------------");
        log.info("-----------------------------------------------");
    }
}
