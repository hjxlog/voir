package com.hjxlog.service;

import com.hjxlog.dto.QueryBlogReqDto;
import com.hjxlog.dto.QueryBlogRespDto;
import com.hjxlog.dto.SaveBlogDto;
import com.hjxlog.protocol.PageResult;

/**
 * @author Huang JX
 * @date 2022/3/19
 */
public interface BlogService {

    boolean add(SaveBlogDto dto);

    boolean update(SaveBlogDto dto);

    PageResult<QueryBlogRespDto> list(QueryBlogReqDto dto);

    boolean delete(QueryBlogReqDto dto);

}
