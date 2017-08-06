package com.amberllo.bookstore.service;


import com.amberllo.bookstore.bean.User;
import com.amberllo.bookstore.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2017/7/29 0029.
 */
@Service
public class UserService {

    public User findByName(String name) {
        User user = new User();
        user.setName(name);
        user.setAge(12);
        return user;
    }

    public User auth(String name,String password) {
        User user = new User();
        user.setName(name);
        user.setAge(12);
        return user;
    }

//    @Autowired
//    private UserRepository userRepository;
}
