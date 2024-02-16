package com.sajan.hiservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient

@SpringBootApplication
public class HiServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(HiServiceApplication.class, args);
    }

}
