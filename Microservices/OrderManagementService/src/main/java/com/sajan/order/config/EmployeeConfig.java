package com.sajan.order.config;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class EmployeeConfig {
    @Value("http://localhost:1111/book-service")
    private String bookBaseUrl;
    @Bean
    public ModelMapper modelMapper(){
        return new ModelMapper();
    }
}
