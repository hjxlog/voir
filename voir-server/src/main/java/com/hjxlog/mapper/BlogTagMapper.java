package com.hjxlog.mapper;

import com.hjxlog.domain.BlogTag;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface BlogTagMapper {

    boolean delete(@Param("blogId") Integer blogId, @Param("tagId") Integer tagId);

    boolean insert(BlogTag record);

}