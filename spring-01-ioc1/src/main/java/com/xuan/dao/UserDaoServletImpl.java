package com.xuan.dao;

public class UserDaoServletImpl implements UserDao{
    @Override
    public void getUser() {
        System.out.println("servlet获取信息！");
    }
}
