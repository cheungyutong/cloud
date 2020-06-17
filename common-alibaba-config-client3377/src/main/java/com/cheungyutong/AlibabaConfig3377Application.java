package com.cheungyutong;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Author cheungyutong
 * @Date 2020/6/16 21:28
 */
@SpringBootApplication
@Slf4j
@EnableDiscoveryClient
public class AlibabaConfig3377Application {
    public static void main(String[] args) {
        SpringApplication.run(AlibabaConfig3377Application.class, args);

        log.info("-----------------------------------------------");
        log.info("-----------------------------------------------");
        log.info("-----------------------------------------------");
        log.info("----- NacosConfig3377Application start up -----");
        log.info("-----------------------------------------------");
        log.info("-----------------------------------------------");
        log.info("-----------------------------------------------");
    }
}
