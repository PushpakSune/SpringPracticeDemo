package com.example.demo.service;

import com.example.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.model.User;

import java.util.ArrayList;
import java.util.List;


@Service
public class UserService {
    @Autowired
    UserRepository ur;
    User user;
public List<User> getUser(){
	Iterable<User> allusers = ur.findAll();
    List<User> li = new ArrayList<User>();
    allusers.forEach(x->li.add(x));
    System.out.println("-----------------------------------_________________________________-----------------------");
    System.out.println(li);
    System.out.println("-----------------------------------_________________________________-----------------------");


    return li;
}
}
