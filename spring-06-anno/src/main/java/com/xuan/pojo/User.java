package com.xuan.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
//等价于 <bean id="user" class="com.xuan.pojo.User"/>
public class User {
    @Value("zhangsan")//等价于<property name= "name" value="zhangsan"/>
    public String name;
}
