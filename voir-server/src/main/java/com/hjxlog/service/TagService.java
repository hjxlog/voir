package com.hjxlog.service;

import com.hjxlog.dto.QueryTagRespDto;
import com.hjxlog.dto.TagInputDto;
import com.hjxlog.protocol.PageResult;

/**
 * @author Huang JX
 * @date 2022/3/19
 */
public interface TagService {

    boolean add(TagInputDto dto);

    boolean update(TagInputDto dto);

    PageResult<QueryTagRespDto> list(TagInputDto dto);

    boolean delete(TagInputDto dto);

}
