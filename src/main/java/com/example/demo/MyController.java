package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
    @GetMapping("/")
    public String hello(){
        return "Hello";
    }
    @GetMapping("/home")
    public String home(){
        return "Home page change";
    }
}

