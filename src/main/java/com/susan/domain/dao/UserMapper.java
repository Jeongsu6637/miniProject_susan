package com.susan.domain.dao;

import com.susan.domain.request.SignupRequest;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {

    int signup(SignupRequest signupRequest);
    // 일반유저
    void signupAsUser(SignupRequest signupRequest);
    // 사업자
    void signupAsAdmin(SignupRequest signupRequest);
    String equalCheck(String userid);

}