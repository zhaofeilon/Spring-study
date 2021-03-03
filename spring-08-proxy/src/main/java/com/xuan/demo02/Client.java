package com.xuan.demo02;

public class Client {
    public static void main(String[] args) {
        UserServiceImpl userService=new UserServiceImpl();
        UserServiceproxy proxy=new UserServiceproxy();
        proxy.setUserService(userService);
        proxy.add();
        proxy.update();
    }


}
