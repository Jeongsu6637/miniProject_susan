package com.susan.domain.dao;

import com.susan.domain.entity.SearchByKeyword;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ProductMapper {

    List<SearchByKeyword> searchByKeyword(String keyword);
}
