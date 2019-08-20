package com.lois.test;


import com.lois.service.AccountService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AccountTest {
    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        AccountService accountService = ac.getBean("accountService", AccountService.class);
        accountService.transfer();
    }
}
