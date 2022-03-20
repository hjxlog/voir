package com.hjxlog.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.hjxlog.domain.Tag;
import com.hjxlog.dto.QueryTagRespDto;
import com.hjxlog.dto.TagInputDto;
import com.hjxlog.mapper.TagMapper;
import com.hjxlog.protocol.PageResult;
import com.hjxlog.service.TagService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Huang JX
 * @date 2022/3/19
 */
@Service
public class TagServiceImpl implements TagService {

    @Autowired
    private TagMapper tagMapper;

    @Override
    public boolean add(TagInputDto dto) {
        Tag tag = new Tag();
        BeanUtils.copyProperties(dto, tag);
        return tagMapper.insert(tag);
    }

    @Override
    public boolean update(TagInputDto dto) {
        Integer id = dto.getId();
        Tag tag = tagMapper.select(id);
        BeanUtils.copyProperties(dto, tag);
        return tagMapper.update(tag);
    }

    @Override
    public PageResult<QueryTagRespDto> list(TagInputDto dto) {
        Integer pageNum = dto.getPageNum();
        Integer pageSize = dto.getPageSize();
        PageHelper.startPage(pageNum, pageSize);
        List<QueryTagRespDto> list = tagMapper.list(dto);
        PageInfo<QueryTagRespDto> pageInfo = new PageInfo<>(list);
        PageResult<QueryTagRespDto> pageResult = new PageResult<>(pageInfo.getPages(), pageInfo.getList());
        return pageResult;
    }

    @Override
    public boolean delete(TagInputDto dto) {
        Integer id = dto.getId();
        return tagMapper.delete(id);
    }

}
