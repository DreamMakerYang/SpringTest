package com.lois.test;

import com.lois.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserTest {
    @Test
    public void findAllUser(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        UserService userService = ac.getBean("userService", UserService.class);
        System.out.println(userService.findAll());
    }
}
