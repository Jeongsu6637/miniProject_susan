package com.susan.service;

import com.susan.domain.dao.UserMapper;
import com.susan.domain.entity.User;
import com.susan.domain.request.IdFindRequest;
import com.susan.domain.request.LoginRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

@Service
public class UserService {


    private final UserMapper userMapper;

    @Autowired
    private RedisTemplate<String, User> redisTemplate;

    public UserService(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    public User login(LoginRequest loginRequest) {
        User user = login_RedisCheck(loginRequest);
        if (user == null) {
            user = userMapper.login(loginRequest);
            if (user != null)
                login_RedisSetUser(user);
            return user;
        }
        else
            return user;
    }

    public User idFind(IdFindRequest idFindRequest) {
        return userMapper.idFind(idFindRequest);
    }

    private User login_RedisCheck(LoginRequest request){
        User loginuser = redisTemplate.opsForValue().get("loginuser_" + request.getId());
        return loginuser;
    }

    private void login_RedisSetUser(User user){
        redisTemplate.opsForValue().set("loginuser_" + user.getId(), user, 1, TimeUnit.MINUTES);
    }
}
