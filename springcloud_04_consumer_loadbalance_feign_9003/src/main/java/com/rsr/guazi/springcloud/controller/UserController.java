package com.rsr.guazi.springcloud.controller;

import com.rsr.guazi.springcloud.domain.User;
import com.rsr.guazi.springcloud.service.UserClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/consumer")
public class UserController {
    private String URL_PREFIX="http://localhost:8001/provider/user/";

    @Autowired
    private UserClient userClient;
    @RequestMapping("/user/{id}")
    public User getUser(@PathVariable("id") Long id){
//   通过这个去发送访问服务提供者就是写的congtroller的路径 restTemplate
       return userClient.loadUser(id);
    }
}
