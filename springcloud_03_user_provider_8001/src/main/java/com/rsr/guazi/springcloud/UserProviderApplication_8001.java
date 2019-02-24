package com.rsr.guazi.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient//标注为Eureka的一个表示是eureka的客户端
public class UserProviderApplication_8001 {

    public static void main(String[] args) {
        SpringApplication.run(UserProviderApplication_8001.class);
    }


}
