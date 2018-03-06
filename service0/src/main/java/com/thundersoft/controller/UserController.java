package com.thundersoft.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author YuanJian
 * @data 18-3-6上午11:09
 */
@RestController
public class UserController {

    @RequestMapping(value = "/")
    public String index() {
        return "Hello This Is Service0";
    }

    @RequestMapping(value = "/test")
    public String test() {
        return "Service0";
    }
}
