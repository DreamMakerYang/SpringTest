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

    public List<Account> findAll() {
        return accountDao.findAll();
    }

    public Account findById(int id) {
        return accountDao.findById(id);
    }

    public void update(Account account) {
        accountDao.update(account);
    }

    public void save(Account account) {
        accountDao.save(account);
    }

    public void deleteById(int id) {
        accountDao.deleteById(id);
    }
}
