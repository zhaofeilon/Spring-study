package com.xuan.service;

import com.xuan.dao.UserDao;
import com.xuan.dao.UserDaoImpl;
import com.xuan.dao.UserDaoMySqlImpl;

public class UserServiceImpl implements UserService{

    private UserDao userDao;
    //利用set注入
    public void setUserDao(UserDao userDao){
        this.userDao=userDao;
    }

    public void getUser() {
        userDao.getUser();
    }
}
