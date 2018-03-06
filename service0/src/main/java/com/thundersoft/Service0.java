package com.thundersoft;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author YuanJian
 * @data 18-3-6上午10:34
 */
@SpringBootApplication
@EnableEurekaClient
public class Service0 {
    public static void main(String[] args) {
        SpringApplication.run(Service0.class, args);
    }
}