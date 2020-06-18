package com.cheungyutong;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Author cheungyutong
 * @Date 2020/6/17 14:23
 */
@SpringBootApplication
@Slf4j
@EnableDiscoveryClient
public class AlibabaSentinel8401Application {
    public static void main(String[] args) {
        SpringApplication.run(AlibabaSentinel8401Application.class, args);

        log.info("-----------------------------------------------");
        log.info("-----------------------------------------------");
        log.info("-----------------------------------------------");
        log.info("--- AlibabaSentinel8401Application start up ---");
        log.info("-----------------------------------------------");
        log.info("-----------------------------------------------");
        log.info("-----------------------------------------------");
    }
}
