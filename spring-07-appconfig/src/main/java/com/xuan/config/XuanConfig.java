package com.xuan.config;

import com.xuan.pojo.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

//这个也会spring容器托管，注册到容器中，因为他本来就是一个@component，
// @configuration代表这是一个配置类，就和之前的beans。xml一样
@Configuration
@ComponentScan("com.xuan.pojo")
@Import(XuanConfig2.class)
public class XuanConfig {
    //注册一个bean ，就相当于之前的一个bean标签
    //方法名就相当与 id
    //方法的返回值，就相当于标签中的class属性
    @Bean
    public User getUser(){
        return new User();
    }
}
