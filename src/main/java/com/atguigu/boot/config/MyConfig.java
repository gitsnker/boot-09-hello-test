package com.atguigu.boot.config;

import com.atguigu.hello.service.HelloService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Mr.Chen
 * @version 1.0
 **/
@Configuration
public class MyConfig {
    @Bean
    public HelloService helloService(){
        return helloService();
    }
}
