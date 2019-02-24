package com.rsr.guazi.springcloud;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

//sringboot环境启动类
@SpringBootApplication
@EnableEurekaClient//客户消费端 去拿数据了
@EnableFeignClients(basePackages = "com.rsr.guazi.springcloud.service")// 配置本地接口的包路径
public class UserConsumerApplication_9003 {
     public static void main(String[] args) {
         SpringApplication.run(UserConsumerApplication_9003.class);
     }
}
