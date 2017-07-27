package com.amberllo.bookstore.controller;

import com.amberllo.bookstore.model.UserBean;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.UUID;

/**
 * Created by Administrator on 2017/7/25 0025.
 */
@RestController
public class UserController {

//    @RequestMapping("/user/{name}")
//    public ModelAndView user(@PathVariable("name") String name) {
//        ModelAndView modelAndView = new ModelAndView();
//        UserBean user = new UserBean();
//        user.setUserid(UUID.randomUUID().toString());
//        user.setPassword("123456");
//        user.setToken(UUID.randomUUID().toString());
//        user.setUsername(name);
//
//        modelAndView.addObject(user);
//        modelAndView.setViewName("index");
//        return modelAndView;
//    }


    @RequestMapping("/login")
    public ModelAndView login() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("/user/login");
        return modelAndView;
    }
}