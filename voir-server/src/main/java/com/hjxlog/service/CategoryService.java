package com.hjxlog.service;

import com.hjxlog.dto.CategoryInputDto;
import com.hjxlog.dto.QueryCategoryRespDto;
import com.hjxlog.protocol.PageResult;

/**
 * @author Huang JX
 * @date 2022/3/19
 */
public interface CategoryService {

    boolean add(CategoryInputDto dto);

    boolean update(CategoryInputDto dto);

    PageResult<QueryCategoryRespDto> list(CategoryInputDto dto);

    boolean delete(CategoryInputDto dto);

}
