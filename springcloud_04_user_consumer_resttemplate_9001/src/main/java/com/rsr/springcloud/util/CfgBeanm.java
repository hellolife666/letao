package com.rsr.springcloud.util;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration//配置文件 相当于配置文件xml里面写的类生成bean
public class CfgBeanm {

        @Bean//配置成一个bean
        public RestTemplate getRestTemplate(){



            return new RestTemplate();
        }


}
