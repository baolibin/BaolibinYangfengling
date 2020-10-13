package com.libin.happy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Copyright (c) 2018/11/11. xixi Inc. All Rights Reserved.
 * Authors: libin <2578858653@qq.com>
 * <p>
 * Purpose :
 */
@Controller
public class HelloController {

    @RequestMapping("/hello")
    public String hello() {
        return "Hello Spring Boot!";
    }

    @RequestMapping(value = "/happy")
    public String happy() {
        return "user/index";
    }

    @RequestMapping(value = "/yangfengling_baolibin")
    public String wangwenjia() {
        return "user/time";
    }

}
