package com.lois.service.impl;

import com.lois.dao.UserDao;
import com.lois.dao.impl.UserDaoImpl;
import com.lois.service.UserService;
import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Service
@Scope("singleton")//单例
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDaoImpl;
    @Value("小章")
    private String username;
    @Value("18")
    private int age;

    @PostConstruct
    public void init(){
        System.out.println("UserServiceImpl初始化");
    }

    @PreDestroy
    public void destroy(){
        System.out.println("UserServiceImpl销毁了");
    }


    public UserServiceImpl(){
        System.out.println("构建了UserServiceImpl");
    }

    public void show(){
        System.out.println(username+","+age+","+userDaoImpl);
    }

    public String findAll() {
        return userDaoImpl.findAll();
    }
}
