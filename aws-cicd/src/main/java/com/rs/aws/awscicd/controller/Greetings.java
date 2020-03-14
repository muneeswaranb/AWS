package com.rs.aws.awscicd.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Greetings {
    @RequestMapping
    public String greet(){
        return "Hello from MeTooJava..";
    }
}
