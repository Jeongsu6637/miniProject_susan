package com.susan.service;

import com.susan.domain.entity.SearchByKeyword;

import java.util.List;

public interface ProductServiceImpl {
    List<SearchByKeyword> searchByKeyword(String keyword);
}
