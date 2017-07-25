package com.amberllo.bookstore;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2017/7/25 0025.
 */
@RestController
public class BookController {

    @RequestMapping("/greeting/{name}")
    public String greeting(@PathVariable("name") String name) {
        return "hello, " + name;
    }

}
