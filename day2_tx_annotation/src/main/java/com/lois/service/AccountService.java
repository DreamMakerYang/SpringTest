package com.lois.service;

import com.lois.domain.Account;

import java.util.List;

public interface AccountService {

    Account findById(int id);

    void transfer(int sourceId,int targetId,int money);
}
