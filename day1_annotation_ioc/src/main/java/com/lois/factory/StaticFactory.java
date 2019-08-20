package com.lois.factory;

import com.lois.dao.impl.UserDaoImpl;

public class StaticFactory {
    public static UserDaoImpl createUserDaoImpl(){
        return new UserDaoImpl();
    }
}
