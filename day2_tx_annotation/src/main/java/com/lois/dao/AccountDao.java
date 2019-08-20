package com.lois.dao;

import com.lois.domain.Account;

import java.util.List;

public interface AccountDao {
    List<Account> findAll();

    Account findById(int id);

    void update(Account account);

    void save(Account account);

    void deleteById(int id);
}
