package springcloud.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.ribbon.proxy.annotation.Hystrix;
import com.rsr.guazi.springcloud.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/consumer")
public class UserController {
    private String URL_PREFIX="http://localhost:8001/provider/user/";

    @Autowired
    private RestTemplate restTemplate;


    @RequestMapping("/user/{id}")
    @HystrixCommand
    public User getUser(@PathVariable("id") Long id){
//   通过这个去发送访问服务提供者就是写的congtroller的路径 restTemplate
//        USER-PROVIDER服务中心注册的名字。 消费地址
      return   restTemplate.getForObject("http://USER-PROVIDER1/provider/user/"+id, User.class);

    }
}
