package com.cheungyutong.config;

import com.sun.corba.se.spi.orb.ParserImplBase;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

import java.security.PublicKey;

/**
 * @Author cheungyutong
 * @Date 2020/6/10 14:48
 */
@Configuration
public class ApplicationContextConfig {

    @Bean
    @LoadBalanced
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }
}
//application.xml
//利用<bean id = "" class = "">
//使用@LoadBalanced注解赋予RestTemplate负载均衡的能力