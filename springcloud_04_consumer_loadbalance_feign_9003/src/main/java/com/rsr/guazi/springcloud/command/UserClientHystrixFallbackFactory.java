package com.rsr.guazi.springcloud.command;

import com.rsr.guazi.springcloud.domain.User;
import com.rsr.guazi.springcloud.service.UserClient;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

//UserClient 表示对那个接口进行托底处理
@Component
public class UserClientHystrixFallbackFactory implements FallbackFactory<UserClient> {


    public UserClient create(Throwable throwable) {
        return new UserClient() {
            public User loadUser(Long id) {
                return new User(id,"出异常，请联系管理员");
            }
        };
    }
}
