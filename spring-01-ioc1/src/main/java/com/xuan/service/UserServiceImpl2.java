package com.xuan.service;

import com.xuan.dao.UserDao;
import com.xuan.dao.UserDaoImpl;
import com.xuan.dao.UserDaoMySqlImpl;

public class UserServiceImpl2 implements UserService{

    private  UserDao userDao=new UserDaoMySqlImpl();
    @Override
    public void getUser() {
        userDao.getUser();
    }
}
