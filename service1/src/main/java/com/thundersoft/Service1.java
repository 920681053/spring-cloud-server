package com.thundersoft;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

/**
 * @author YuanJian
 * @data 18-3-6上午10:34
 */
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
public class Service1 {
    public static void main(String[] args) {
        SpringApplication.run(Service1.class, args);
    }
}
