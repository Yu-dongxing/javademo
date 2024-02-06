package com.atguigu.spring6.resource.controller;

import com.atguigu.spring6.resource.service.UserService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Controller;

//根据名称注入
@Controller
public class UserController {
    @Resource(name = "myUserService")
    private UserService userService;

    public void add(){
        System.out.println("controllr....");
        userService.add();

    }
}
