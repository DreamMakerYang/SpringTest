package com.lois.dao;

import com.lois.domain.User;

import java.util.List;

public interface UserDao {
    public List<User> findAll();
}
