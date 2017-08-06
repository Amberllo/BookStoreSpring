package com.amberllo.bookstore;

import com.amberllo.bookstore.controller.UserController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2017/8/3 0003.
 */
@EnableAutoConfiguration
@SpringBootApplication
@RestController
public class StoreApplication {
    public static void main(String[] args){
        //通过SpringApplication的run()方法启动应用，无需额外的配置其他的文件
        SpringApplication.run(StoreApplication.class, args);
    }

    @Autowired
    UserController userController;


    @RequestMapping("/")
    String welcome(){
        return "welcome";
    }

}
