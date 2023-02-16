package com.example.springbootdemo1.controller;

import com.example.springbootdemo1.dataObject.User;
import com.example.springbootdemo1.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("user")
public class UserController {
    @Autowired
    private UserRepository userRepository;

    @RequestMapping("/getAllUser")
    public List<User> findAll() {
        List<User> list = new ArrayList<User>();
        list = userRepository.findAll();
        return list;
    }

    @RequestMapping("/getByUserId")
    public User getByUserId(int id) {
        User user = userRepository.findById(id);
        return user;
    }
    @RequestMapping("/getByLoginName")
    public User getByLoginName(String loginName){
        User user = userRepository.findByLoginName(loginName);
        return user;
    }

}
