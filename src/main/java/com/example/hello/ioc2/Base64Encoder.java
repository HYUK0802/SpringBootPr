package com.example.hello.ioc2;

import org.springframework.stereotype.Component;

import java.util.Base64;

@Component
public class Base64Encoder implements IEncoder{



    public String encode(String message) {
        return Base64.getEncoder().encodeToString(message.getBytes());
    }
}
