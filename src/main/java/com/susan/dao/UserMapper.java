package com.susan.dao;

import com.susan.domain.entity.User;
import com.susan.domain.request.IdFindRequest;
import com.susan.domain.request.LoginRequest;
import com.susan.domain.request.SignupRequest;
import com.susan.domain.request.UserUpdateRequest;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {
    User login(LoginRequest request);
    User idFind(IdFindRequest idFindRequest);
    int userupdate(UserUpdateRequest userUpdateRequest);
    User finduser(String userId);
    int signup(SignupRequest signupRequest);
    // 일반유저
    void signupAsUser(SignupRequest signupRequest);
    // 사업자
    void signupAsAdmin(SignupRequest signupRequest);
    String equalCheck(String userid);
}
