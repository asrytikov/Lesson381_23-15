package com.example.lesson381;

import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableFeignClients(basePackages = "com.example.lesson381.proxy")
public class ProjectConfig {
}
