package com.cheungyutong;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Author cheungyutong
 * @Date 2020/6/16 19:28
 */
@SpringBootApplication
@Slf4j
@EnableDiscoveryClient
public class AlibabaOrder84Application {
    public static void main(String[] args) {
        SpringApplication.run(AlibabaOrder84Application.class, args);

        log.info("-----------------------------------------------");
        log.info("-----------------------------------------------");
        log.info("-----------------------------------------------");
        log.info("------ NacosOrder84Application start up -------");
        log.info("-----------------------------------------------");
        log.info("-----------------------------------------------");
        log.info("-----------------------------------------------");
    }
}
