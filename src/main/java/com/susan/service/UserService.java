package com.susan.service;

import com.susan.domain.dao.UserMapper;
import com.susan.domain.entity.User;
import com.susan.domain.request.IdFindRequest;
import com.susan.domain.request.LoginRequest;
import com.susan.domain.request.SignupRequest;
import com.susan.domain.request.UserUpdateRequest;
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

    public User findUser(String userId) {
        User user = getRedisUser(userId);
        if (user != null)
            return user;
        else
            return userMapper.finduser(userId);
    }
    private User login_RedisCheck(LoginRequest request){
        User loginuser = redisTemplate.opsForValue().get("loginuser_" + request.getId());
        return loginuser;
    }

    private void login_RedisSetUser(User user){
        redisTemplate.opsForValue().set("loginuser_" + user.getId(), user, 1, TimeUnit.MINUTES);
    }

    private User getRedisUser(String userId){
        User user = redisTemplate.opsForValue().get("loginuser_" + userId);
        return user;
    }

    public int userUpdate(UserUpdateRequest request) {
        return userMapper.userupdate(request);
    }
    // 회원가입 요청 처리


    public String equalCheck(String userid){
        return userMapper.equalCheck(userid);
    }

    // 중복 아이디 존재 여부
    public boolean isUsernameExists(SignupRequest signupRequest) {
        return userMapper.signup(signupRequest) > 0;
    }


//    public boolean signupAsAdmin(SignupRequest signupRequest) {
//        try {
//            userMapper.signupAsAdmin(signupRequest);
//            return true;
//        } catch (Exception e) {
//            e.printStackTrace();
//            return false;
//        }
//
//        // 성공시  true, 실패시 false
//    }

    public boolean signupAsUser(SignupRequest signupRequest) {
        if (isUsernameExists(signupRequest)) {
            return false; // 아이디가 이미 존재하면 회원가입 실패
        }
        try {
            // 일반 유저 모드 회원가입 로직 구현
            userMapper.signupAsUser(signupRequest);
            return true; // 성공 시 true 반환
        } catch (Exception e) {
            e.printStackTrace();
            return false; // 실패 시 false 반환
        }
    }

    public boolean signupAsAdmin(SignupRequest signupRequest) {
        if (isUsernameExists(signupRequest)) {
            return false; // 아이디가 이미 존재하면 회원가입 실패
        }
        try {
            // 상점 대표 모드 회원가입 로직 구현
            userMapper.signupAsAdmin(signupRequest);
            return true; // 성공 시 true 반환
        } catch (Exception e) {
            e.printStackTrace();
            return false; // 실패 시 false 반환
        }
    }
}

