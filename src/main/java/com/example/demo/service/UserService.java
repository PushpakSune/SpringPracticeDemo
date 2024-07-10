package com.example.demo.service;

import com.example.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.model.User;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


@Service
public class UserService {
    @Autowired
    UserRepository ur;
    User user;
 public List<User> getUser(){
	Iterable<User> allusers = ur.findAll();
    List<User> li = new ArrayList<User>();
    allusers.forEach(x->li.add(x));
    System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
    System.out.println(li);
    System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
    return li;
}

 public User getOneUser(int id)
 {
     Optional<User> user=ur.findById(id);
     User user1 = user.get();
     return user1;
 }
  public User addUser(User user)
  {
      User susr = ur.save(user);
      return susr;
  }
}
