package com.rsr.guazi.springcloud.controller;

import com.rsr.guazi.springcloud.domain.User;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/provider")
public class UserController {

    @RequestMapping("/user/{id}")
    public User loadUser(@PathVariable("id") Long id){

        System.out.println("hahaa");

        return new User(id,"kkkk");
    }

}
