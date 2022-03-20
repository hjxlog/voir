package com.hjxlog.mapper;

import com.hjxlog.domain.Category;
import com.hjxlog.dto.CategoryInputDto;
import com.hjxlog.dto.QueryCategoryRespDto;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface CategoryMapper {

    boolean delete(Integer id);

    boolean insert(Category record);

    Category select(Integer id);

    boolean update(Category record);

    List<QueryCategoryRespDto> list(CategoryInputDto dto);
}