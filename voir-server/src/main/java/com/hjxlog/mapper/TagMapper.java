package com.hjxlog.mapper;

import com.hjxlog.domain.Tag;
import com.hjxlog.dto.QueryTagRespDto;
import com.hjxlog.dto.TagInputDto;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TagMapper {

    boolean delete(Integer id);

    boolean insert(Tag record);

    Tag select(Integer id);

    boolean update(Tag record);

    List<QueryTagRespDto> list(TagInputDto dto);
}