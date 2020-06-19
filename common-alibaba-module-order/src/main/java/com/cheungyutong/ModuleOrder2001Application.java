package com.cheungyutong;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @Author cheungyutong
 * @Date 2020/6/19 17:51
 */
@SpringBootApplication(exclude = DataSourceAutoConfiguration.class) //取消数据源自动创建
@Slf4j
@EnableFeignClients
@EnableDiscoveryClient
public class ModuleOrder2001Application {
    public static void main(String[] args) {
        SpringApplication.run(ModuleOrder2001Application.class,args);

        log.info("-----------------------------------------------");
        log.info("-----------------------------------------------");
        log.info("-----------------------------------------------");
        log.info("----- ModuleOrder2001Application start up -----");
        log.info("-----------------------------------------------");
        log.info("-----------------------------------------------");
        log.info("-----------------------------------------------");
    }
}
