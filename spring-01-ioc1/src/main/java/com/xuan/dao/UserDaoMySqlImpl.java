package com.xuan.dao;

public class UserDaoMySqlImpl implements UserDao{

    @Override
    public void getUser() {
        System.out.println("数据库获取信息");
    }
}
