package springcloud.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.ribbon.proxy.annotation.Hystrix;
import com.rsr.guazi.springcloud.domain.User;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/provider")
public class UserController {

    @RequestMapping("/user/{id}")
    @HystrixCommand(fallbackMethod = "failget")
    public User loadUser(@PathVariable("id") Long id){
            if (id==2){

                throw new RuntimeException("傻逼了");
            }


        return new User(id,"萝卜了");
    }

    public User failget(Long id){


        return new User(id,"用户名不存在");
    }



}
