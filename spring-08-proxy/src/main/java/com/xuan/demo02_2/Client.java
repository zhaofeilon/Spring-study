package com.xuan.demo02_2;

import com.xuan.demo02.UserService;
import com.xuan.demo02.UserServiceImpl;

public class Client {
    public static void main(String[] args) {
        //真实角色
        UserServiceImpl userService=new UserServiceImpl();
        //代理角色 不存在
        ProxyInvocationHandler pih = new ProxyInvocationHandler();

        pih.setTarget(userService);//设置代理的对象
//        动态生成代理
        UserService proxy =(UserService) pih.getProxy();
        proxy.add();
        proxy.delete();

    }
}
