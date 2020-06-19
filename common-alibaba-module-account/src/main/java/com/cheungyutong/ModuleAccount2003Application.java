package com.cheungyutong;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @Author cheungyutong
 * @Date 2020/6/19 20:28
 */
@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
@Slf4j
@EnableFeignClients
@EnableDiscoveryClient
public class ModuleAccount2003Application {
    public static void main(String[] args) {
        SpringApplication.run(ModuleAccount2003Application.class, args);

        log.info("-----------------------------------------------");
        log.info("-----------------------------------------------");
        log.info("-----------------------------------------------");
        log.info("---- ModuleAccount2003Application start up ----");
        log.info("-----------------------------------------------");
        log.info("-----------------------------------------------");
        log.info("-----------------------------------------------");
    }
}
