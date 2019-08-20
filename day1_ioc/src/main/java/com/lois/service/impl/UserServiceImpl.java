package com.lois.service.impl;

import com.lois.dao.UserDao;
import com.lois.dao.impl.UserDaoImpl;
import com.lois.service.UserService;

public class UserServiceImpl implements UserService {

    private UserDao userDao;
    private String username;
    private int age;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setAge(int age) {
        this.age = age;
    }

    //    public UserServiceImpl(UserDao userDao,String username,int age){
//        this.userDao = userDao;
//        this.username = username;
//        this.age = age;
//    }

    public UserServiceImpl(){
        System.out.println("构建了UserServiceImpl");
    }

    public void show(){
        System.out.println(username+","+age+","+userDao);
    }

    public String findAll() {
        return userDao.findAll();
    }
}
