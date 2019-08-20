package com.lois.test;


import com.lois.domain.Account;
import com.lois.service.AccountService;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:ApplicationContext.xml")
public class AccountTest {

    @Autowired
    private AccountService accountService;

    @Test
    public void findAll(){
        System.out.println(accountService.findAll());
    }

    @Test
    public void findById(){
        System.out.println(accountService.findById(1));
    }

    @Test
    public void save(){
        Account account = new Account();
        account.setName("小白");
        account.setMoney(1000);
        accountService.save(account);
        System.out.println("保存成功 " + accountService.findById(3));
    }

    @Test
    public void update(){
        Account account = accountService.findById(3);
        account.setMoney(2000);
        accountService.update(account);
        System.out.println("更新成功" + accountService.findById(3));
    }

    @Test
    public void deleteById(){
        accountService.deleteById(3);
    }
}
