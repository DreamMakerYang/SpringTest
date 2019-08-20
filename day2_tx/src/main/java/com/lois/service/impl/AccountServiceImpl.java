package com.lois.service.impl;


import com.lois.dao.AccountDao;
import com.lois.domain.Account;
import com.lois.service.AccountService;

import java.util.List;

public class AccountServiceImpl implements AccountService {

    private AccountDao accountDao;

    public void setAccountDao(AccountDao accountDao) {
        this.accountDao = accountDao;
    }


    public Account findById(int id) {
        return accountDao.findById(id);
    }

    public void transfer(int sourceId, int targetId, int money) {
        Account source = accountDao.findById(sourceId);
        Account target = accountDao.findById(targetId);

        source.setMoney(source.getMoney() - money);
        target.setMoney(target.getMoney() + money);

        accountDao.update(source);
        int i = 1/0;
        accountDao.update(target);

    }
}
