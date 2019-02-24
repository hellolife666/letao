package com.rsr.guazi.springcloud.service;

import com.rsr.guazi.springcloud.command.UserClientHystrixFallbackFactory;
import com.rsr.guazi.springcloud.domain.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(value = "USER-PROVIDER1",fallbackFactory = UserClientHystrixFallbackFactory.class)
@RequestMapping("/provider")
public interface UserClient {

    @RequestMapping("/user/{id}")
     User loadUser(@PathVariable("id") Long id);


}
