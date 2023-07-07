package com.susan.service;

import com.susan.domain.entity.SearchByKeyword;
import com.susan.domain.request.ShowDetailRequest;

import java.util.List;

public interface ProductServiceImpl {
    List<SearchByKeyword> searchDefault(String keyword);
    List<SearchByKeyword> searchDesc(String keyword);
    List<SearchByKeyword> searchAsc(String keyword);
    List<ShowDetailRequest> showDetail(String name);
}
