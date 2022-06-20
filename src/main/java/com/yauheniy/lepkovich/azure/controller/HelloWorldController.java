package com.yauheniy.lepkovich.azure.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @Value("${hello-world-message}")
    private String helloWorldMessage;

    @GetMapping("")
    public String helloWorld() {
        return helloWorldMessage;
    }

}
