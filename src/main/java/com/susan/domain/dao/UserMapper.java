package com.susan.domain.dao;

import com.susan.domain.entity.User;
import com.susan.domain.request.IdFindRequest;
import com.susan.domain.request.LoginRequest;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {
    User login(LoginRequest request);
    User idFind(IdFindRequest idFindRequest);
}
