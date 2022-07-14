package com.securitybasic.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SecurityBasicController {

    @GetMapping("/welcome")
    public String sayWelcome() {
        return "Welcome from Spring Application with Security";
    }

}
