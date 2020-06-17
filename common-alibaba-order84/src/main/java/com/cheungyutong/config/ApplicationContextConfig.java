package com.cheungyutong.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @Author cheungyutong
 * @Date 2020/6/16 20:02
 */
@Configuration
public class ApplicationContextConfig {

    @Bean
    @LoadBalanced //负载均衡
    public RestTemplate getRestTempalte(){
        return new RestTemplate();
    }
}
