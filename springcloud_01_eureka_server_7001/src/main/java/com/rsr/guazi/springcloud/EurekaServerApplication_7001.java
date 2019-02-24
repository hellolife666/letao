package com.rsr.guazi.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer //表示为eureka的服务 注册管理登记中心
public class EurekaServerApplication_7001 {

    public static void main(String[] args) {
        SpringApplication.run(EurekaServerApplication_7001.class);
    }
}
