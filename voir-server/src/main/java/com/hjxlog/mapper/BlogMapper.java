package com.hjxlog.mapper;

import com.hjxlog.domain.Blog;
import com.hjxlog.dto.QueryBlogReqDto;
import com.hjxlog.dto.QueryBlogRespDto;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface BlogMapper {

    Blog select(Integer id);

    boolean delete(Integer id);

    boolean insert(Blog blog);

    boolean update(Blog blog);

    List<QueryBlogRespDto> list(QueryBlogReqDto dto);
}