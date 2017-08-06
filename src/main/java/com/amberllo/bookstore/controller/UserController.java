package com.amberllo.bookstore.controller;

import com.amberllo.bookstore.bean.User;
import com.amberllo.bookstore.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2017/7/25 0025.
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;


    //设置访问的url
    @RequestMapping("/auth")
    public User auth(@PathVariable  String username,String password) {
        return userService.auth(username,password);
    }

    @RequestMapping("/{name}")
    public User user(@PathVariable("name") String name){
        return userService.findByName(name);
    }
}