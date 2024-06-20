package com.example.EnvironmentVariables1.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EnvironmentVariablesController {

    @Value("${devName}")
    private String devName;

    @Value("${authCode}")
    private String authCode;

    @GetMapping("/greet")
    public String greet() {
        return "Hello, " + devName + "! Your auth code is " + authCode + ".";
    }
}

//http://localhost:4500/greet