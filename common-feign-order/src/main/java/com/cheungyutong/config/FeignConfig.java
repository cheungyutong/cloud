package com.cheungyutong.config;

import feign.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author cheungyutong
 * @Date 2020/6/12 11:33
 * @deprecation 配置feign的日志，级别分为NONE、BASIC、HEADERS、FULL
 */
@Configuration
public class FeignConfig {

    @Bean
    Logger.Level feignLoggerLevel(){
        return Logger.Level.FULL;
    }
}
