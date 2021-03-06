package com.cheungyutong;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Author cheungyutong
 * @Date 2020/6/16 17:15
 */
@SpringBootApplication
@EnableDiscoveryClient
@Slf4j
public class AlibabaProvider9002Application {
    public static void main(String[] args) {
        SpringApplication.run(AlibabaProvider9002Application.class, args);

        log.info("-----------------------------------------------");
        log.info("-----------------------------------------------");
        log.info("-----------------------------------------------");
        log.info("---- NacosProvider9002Application start up ----");
        log.info("-----------------------------------------------");
        log.info("-----------------------------------------------");
        log.info("-----------------------------------------------");
    }
}
