package springcloud.util;


import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration//配置文件 相当于配置文件xml里面写的类生成bean
public class CfgBeanm {

        @Bean//配置成一个bean
        @LoadBalanced //负载均衡:默认采用的是轮训策略
        public RestTemplate getRestTemplate(){
            return new RestTemplate();
        }
    @Bean
    public IRule myRule(){
        return new RandomRule();

    }
}
