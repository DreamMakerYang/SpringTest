package com.lois.service.impl;


import com.lois.service.AccountService;
import org.springframework.stereotype.Service;

@Service("accountService")
public class AccountServiceImpl implements AccountService {

    public void transfer() {
        System.out.println("转账操作");
//        int i = 1/0;
    }
}
