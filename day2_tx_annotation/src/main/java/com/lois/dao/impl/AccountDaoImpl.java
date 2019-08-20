package com.lois.dao.impl;

import com.lois.dao.AccountDao;
import com.lois.domain.Account;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class AccountDaoImpl implements AccountDao {

    private JdbcTemplate jdbcTemplate;

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public List<Account> findAll() {
        String sql = "select * from account";
        return jdbcTemplate.query(sql,new BeanPropertyRowMapper<Account>(Account.class));
    }

    public Account findById(int id) {
        String sql = "select * from account where id = ?";
        return jdbcTemplate.queryForObject(sql,new BeanPropertyRowMapper<Account>(Account.class),id);
    }

    public void update(Account account) {
        String sql = "update account set name = ? , money = ? where id = ?";
        jdbcTemplate.update(sql,account.getName(),account.getMoney(),account.getId());
    }

    public void save(Account account) {
        String sql = "insert into account(name,money) values (?,?)";
        jdbcTemplate.update(sql,account.getName(),account.getMoney());
    }

    public void deleteById(int id) {
        String sql = "delete from account where id = ?";
        jdbcTemplate.update(sql,id);

    }
}
