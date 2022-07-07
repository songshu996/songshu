package com.common.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"com.ioc.springDemo2.entity","com.aop"})
public class SpringConfig {
}
