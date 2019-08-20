package com.lois.dao.impl;

import com.lois.dao.UserDao;

import java.util.*;

public class UserDaoImpl implements UserDao {
    private String[] strs;
    private List<String> list;
    private Set<String> set;
    private Map<String,String> map;
    private Properties props;

    public void setStrs(String[] strs) {
        this.strs = strs;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public void setSet(Set<String> set) {
        this.set = set;
    }

    public void setMap(Map<String, String> map) {
        this.map = map;
    }

    public void setProps(Properties props) {
        this.props = props;
    }

    public void show() {
        System.out.println(Arrays.toString(strs));
        System.out.println(list);
        System.out.println(set);
        System.out.println(map);
        System.out.println(props);
    }

    public UserDaoImpl(){
        System.out.println("构建了UserDaoImpl");
    }
    //仅是模拟dao
    public String findAll() {
        return "查询出所有用户";
    }


}
