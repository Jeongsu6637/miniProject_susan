package com.susan.service;

import com.susan.domain.dao.UserMapper;
import com.susan.domain.entity.User;
import com.susan.domain.request.IdFindRequest;
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
        return userMapper.login(loginRequest);
    }

    public User idFind(IdFindRequest idFindRequest) {
        return userMapper.idFind(idFindRequest);
    }
    public User userUpdate(User user) {
        return userMapper.userUpdate(user);
    }
}
