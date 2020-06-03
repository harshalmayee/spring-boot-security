package com.javaguides.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1")
public class SpringSecurityController {

    @GetMapping(value = "/message")
    public String greetings(){
        return("<h1>Welcome<h1>");
    }
}
