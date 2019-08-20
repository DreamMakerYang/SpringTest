package com.lois.service;

import com.lois.domain.Account;

import java.util.List;

public interface AccountService {
    List<Account> findAll();

    Account findById(int id);

    void update(Account account);

    void save(Account account);

    void deleteById(int id);
}
