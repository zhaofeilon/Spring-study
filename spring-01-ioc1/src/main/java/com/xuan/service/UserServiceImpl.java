package com.xuan.service;

import com.xuan.dao.UserDao;
import com.xuan.dao.UserDaoImpl;

public class UserServiceImpl implements UserService{

    private UserDao userDao=new UserDaoImpl();

    public void getUser() {
        userDao.getUser();
    }
}
