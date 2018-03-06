package com.thundersoft.client;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author YuanJian
 * @data 18-3-6上午11:14
 */
@FeignClient("service0")
public interface Service0Client {

    @RequestMapping(path = "test")
    String test();
}
