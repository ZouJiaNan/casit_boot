package com.casit.boot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import com.casit.boot.service.userService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class userController {
    @Autowired
    userService service;

    @RequestMapping("/users")
    public void list(){
        List list=service.list();
        System.out.println(list.size());
    }

}
