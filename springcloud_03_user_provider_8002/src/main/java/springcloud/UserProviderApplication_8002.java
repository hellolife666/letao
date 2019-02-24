package springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

@SpringBootApplication
@EnableEurekaClient//标注为Eureka的一个表示是eureka的客户端
//断路器配置注解
@EnableHystrix
public class UserProviderApplication_8002 {

    public static void main(String[] args) {
        SpringApplication.run(UserProviderApplication_8002.class);
    }


}
