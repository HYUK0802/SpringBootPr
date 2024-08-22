package com.example.hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api1")
public class ApiController {

    @GetMapping("/hello")
    public String hello() {
        return "hello spring boot!";
    }
}
