package com.example.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @Autowired Environment environment;

    @GetMapping("/key01")
    public  String hello(){
        return environment.getProperty("key-01");
    }
    @GetMapping("/key02")
    public  String hello2(){
        return environment.getProperty("key-02");
    }
    @GetMapping("/key03")
    public  String hello3(){
        return environment.getProperty("key-03");
    }
}
