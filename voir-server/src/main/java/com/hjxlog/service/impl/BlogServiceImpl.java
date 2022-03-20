package com.hjxlog.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.hjxlog.domain.Blog;
import com.hjxlog.dto.QueryBlogReqDto;
import com.hjxlog.dto.QueryBlogRespDto;
import com.hjxlog.dto.SaveBlogDto;
import com.hjxlog.mapper.BlogMapper;
import com.hjxlog.protocol.PageResult;
import com.hjxlog.service.BlogService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Huang JX
 * @date 2022/3/19
 */
@Service
public class BlogServiceImpl implements BlogService {

    @Autowired
    private BlogMapper blogMapper;

    @Override
    public boolean add(SaveBlogDto dto) {
        Blog blog = new Blog();
        BeanUtils.copyProperties(dto, blog);
        return blogMapper.insert(blog);
    }

    @Override
    public boolean update(SaveBlogDto dto) {
        Integer id = dto.getId();
        Blog blog = blogMapper.select(id);
        BeanUtils.copyProperties(dto, blog);
        return blogMapper.update(blog);
    }

    @Override
    public PageResult<QueryBlogRespDto> list(QueryBlogReqDto dto) {
        Integer pageNum = dto.getPageNum();
        Integer pageSize = dto.getPageSize();
        PageHelper.startPage(pageNum, pageSize);
        List<QueryBlogRespDto> list = blogMapper.list(dto);
        PageInfo<QueryBlogRespDto> pageInfo = new PageInfo<>(list);
        PageResult<QueryBlogRespDto> pageResult = new PageResult<>(pageInfo.getPages(), pageInfo.getList());
        return pageResult;
    }

    @Override
    public boolean delete(QueryBlogReqDto dto) {
        Integer id = dto.getId();
        return blogMapper.delete(id);
    }
}
