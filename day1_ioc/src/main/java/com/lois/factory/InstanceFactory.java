package com.lois.factory;

import com.lois.service.impl.UserServiceImpl;

public class InstanceFactory {
    public UserServiceImpl createUserServiceImpl(){
        return new UserServiceImpl();
    }
}
