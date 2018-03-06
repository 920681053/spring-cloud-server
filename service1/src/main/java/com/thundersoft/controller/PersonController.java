package com.thundersoft.controller;

import com.thundersoft.client.Service0Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author YuanJian
 * @data 18-3-6上午11:11
 */
@RestController
public class PersonController {

    @Autowired
    private Service0Client service0Client;

    @RequestMapping(value = "/")
    public String index() {
        return "Hello This Is Service1";
    }

    @RequestMapping(value = "/hello")
    public String quote() {
        return service0Client.test() + " Service1";
    }
}