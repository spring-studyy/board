package com.study.spring.board.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@ComponentScan(basePackages = { "com.study.spring.board.dao",  "com.study.spring.board.service"})
@Import({ DBConfig.class })
public class ApplicationConfig {

}