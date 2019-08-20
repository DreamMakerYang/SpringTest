package com.lois.dao.impl;

import com.lois.dao.UserDao;
import com.lois.domain.User;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("userDao")
public class UserDaoImpl implements UserDao {

    @Autowired
    private QueryRunner runner;

    public List<User> findAll() {
        try{
            return runner.query("select * from user",new BeanListHandler<User>(User.class));
        }catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
