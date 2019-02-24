package springcloud;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

//sringboot环境启动类
@SpringBootApplication
@EnableEurekaClient//客户消费端 去拿数据了
@EnableHystrix
public class UserConsumerApplication_9002 {
     public static void main(String[] args) {
         SpringApplication.run(UserConsumerApplication_9002.class);
     }
}
