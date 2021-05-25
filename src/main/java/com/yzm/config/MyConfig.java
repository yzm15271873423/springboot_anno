package com.yzm.config;

import com.yzm.pojo.User;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.*;

/**
 * @Auther: yzm
 * @Date: 2021/5/25 - 05 - 25 - 21:42
 * @Description: com.yzm.config
 * @version: 1.0
 */
@Configuration(proxyBeanMethods = true)
//@Import({User.class})
//@ConditionalOnProperty(name = {"aaa.x"},havingValue = "x")

//@ImportResource("classpath:beans.xml")
public class MyConfig {
/*
    @Bean
    public User user1(){
        return new User("张三",10);
    }*/

   /* @Bean("user2")
    public User getUser(){
        return new User("lisi",17);
    }*/
}
