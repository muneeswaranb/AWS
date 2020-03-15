package com.metoojava.awsbeanstalksample.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BeanStalkController {

    @GetMapping("/hello")
    public String hello(){
        return "Hello Java devs...";
    }
}
