package com.cheungyutong.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @Author cheungyutong
 * @Date 2020/6/19 19:18
 */
@Configuration
@MapperScan("com.cheungyutong.dao")
public class MyBatisConfig {
}
