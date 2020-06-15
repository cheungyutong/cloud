package com.cheungyutong;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Author cheungyutong
 * @Date 2020/6/10 18:42
 */
@SpringBootApplication
@EnableEurekaClient
@Slf4j
@EnableDiscoveryClient
public class Provider8002Application {
    public static void main(String[] args) {
        SpringApplication.run(Provider8002Application.class, args);

        log.info("-----------------------------------------------");
        log.info("-----------------------------------------------");
        log.info("-----------------------------------------------");
        log.info("------ Provider8002Application start up -------");
        log.info("-----------------------------------------------");
        log.info("-----------------------------------------------");
        log.info("-----------------------------------------------");
    }
}
