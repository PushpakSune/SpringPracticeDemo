package com.example.demo.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstRestController {
    @GetMapping(value="/home")

    public String getUser()
    {
        return "Welcome To my First Rest API";
    }
    @PostMapping(value = "/fetch")
    public String rst2()
    {
        String str = "Second Rest API for Post Request ";
     return str;
    }
}
