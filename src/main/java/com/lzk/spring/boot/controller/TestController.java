package com.lzk.spring.boot.controller;

import com.lzk.spring.boot.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@RequestMapping("/spring/boot")
@Controller
public class TestController {

    @Autowired
    private TestService testService;

    @RequestMapping("/test")
    @ResponseBody
    public String test() {
        return testService.countAll().toString();
    }
}
