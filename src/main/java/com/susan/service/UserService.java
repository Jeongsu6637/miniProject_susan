package com.susan.service;

import com.susan.domain.dao.UserMapper;
import com.susan.domain.entity.User;
import com.susan.domain.request.LoginRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {


    private final UserMapper userMapper;

    public UserService(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    public User login(LoginRequest loginRequest) {
        try {
            return userMapper.login(loginRequest);
        } catch (Exception e) {
            return null;
        }
    }
}
