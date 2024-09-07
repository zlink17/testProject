package com.example.demo.configuration;

import com.example.demo.service.TestService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TestConfiguration {
    @Bean
    TestService testService() {
        return new TestService("testService");
    }
}