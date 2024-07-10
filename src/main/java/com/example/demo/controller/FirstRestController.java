package com.example.demo.controller;


import com.example.demo.model.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class FirstRestController {

    @Autowired
    UserService us;
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
    @GetMapping(value = "/homeusers")
    public List<User> getUsers()
    {
        List<User> list = us.getUser();
        return list;
    }

    @GetMapping(value = "/homeuser/{id}")
    public User getUser(@PathVariable ("id")int id)
    {
        User usr = us.getOneUser(id);
        return usr;
    }
}
