package com.susan.domain.dao;

import com.susan.domain.entity.SearchByKeyword;
import com.susan.domain.request.ShowDetailRequest;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ProductMapper {

    List<SearchByKeyword> searchDefault(String keyword);
    List<SearchByKeyword> searchDesc(String keyword);
    List<SearchByKeyword> searchAsc(String keyword);
    List<ShowDetailRequest> showDetail(String name);

}
