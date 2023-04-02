package com.vnsgu.uni.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.HashMap;
import java.util.Map;

@RestController
public class RestContExample {

    @GetMapping(value = "/hello")
    public Map<String, String> helloWorld() {
        Map<String, String> message = new HashMap<>();
        message.put("message", "Hello World");
        return message;
    }

}
