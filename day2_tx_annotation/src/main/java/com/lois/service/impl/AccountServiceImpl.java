package com.lois.service.impl;


import com.lois.dao.AccountDao;
import com.lois.domain.Account;
import com.lois.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service("accountService")
@Transactional(readOnly=true,propagation= Propagation.SUPPORTS)//设置整个类中的方法事务的属性，优先级低
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountDao accountDao;

    public Account findById(int id) {
        return accountDao.findById(id);
    }

    @Transactional(readOnly=false,propagation=Propagation.REQUIRED)//设置该方法的事务属性，优先级高
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
