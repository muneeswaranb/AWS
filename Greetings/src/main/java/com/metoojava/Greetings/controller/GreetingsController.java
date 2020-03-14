package com.metoojava.Greetings.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Response;

@RestController
public class GreetingsController {
@GetMapping("/hello")
    public ResponseEntity<String> sayHello(@QueryParam("name") String name){
    return new ResponseEntity<>("Greetings "+name, HttpStatus.ACCEPTED);
}
}
