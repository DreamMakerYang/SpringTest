package com.lois.dao.impl;

import com.lois.dao.UserDao;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public class UserDaoImpl implements UserDao {
    public void show() {
    }

    public UserDaoImpl(){
        System.out.println("构建了UserDaoImpl");
    }
    //仅是模拟dao
    public String findAll() {
        return "查询出所有用户";
    }
}
