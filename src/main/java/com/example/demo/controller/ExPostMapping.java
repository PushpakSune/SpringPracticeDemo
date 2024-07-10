package com.example.demo.controller;

import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import com.example.demo.model.User;

public class ExPostMapping {
    @Autowired
    UserService us;
      @PostMapping(value = "/Users")
      public User addUser(@RequestBody User user)
      {
          us.a
          return user;
      }
  }
