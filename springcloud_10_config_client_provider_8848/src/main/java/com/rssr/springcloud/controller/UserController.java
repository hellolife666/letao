package com.rssr.springcloud.controller;


import com.rssr.springcloud.domain.User;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/config")
public class UserController {

    @RequestMapping("/user/{id}")
    public User loudUser(@PathVariable("id") Long id){
        return new User(id,"测试配置服务中获取配置文件");
    }
}
