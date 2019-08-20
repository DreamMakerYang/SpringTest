package com.lois.factory;

import com.lois.service.impl.UserServiceImpl;
import org.springframework.context.annotation.Bean;

public class InstanceFactory {
    public UserServiceImpl createUserServiceImpl(){
        return new UserServiceImpl();
    }
}
