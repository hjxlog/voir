package com.hjxlog.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.hjxlog.domain.Category;
import com.hjxlog.dto.CategoryInputDto;
import com.hjxlog.dto.QueryCategoryRespDto;
import com.hjxlog.mapper.CategoryMapper;
import com.hjxlog.protocol.PageResult;
import com.hjxlog.service.CategoryService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Huang JX
 * @date 2022/3/19
 */
@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    private CategoryMapper categoryMapper;

    @Override
    public boolean add(CategoryInputDto dto) {

        Category category = new Category();
        BeanUtils.copyProperties(dto, category);
        return categoryMapper.insert(category);
    }

    @Override
    public boolean update(CategoryInputDto dto) {
        Integer id = dto.getId();
        Category category = categoryMapper.select(id);
        BeanUtils.copyProperties(dto, category);
        return categoryMapper.update(category);
    }

    @Override
    public PageResult<QueryCategoryRespDto> list(CategoryInputDto dto) {
        Integer pageNum = dto.getPageNum();
        Integer pageSize = dto.getPageSize();
        PageHelper.startPage(pageNum, pageSize);
        List<QueryCategoryRespDto> list = categoryMapper.list(dto);
        PageInfo<QueryCategoryRespDto> pageInfo = new PageInfo<>(list);
        PageResult<QueryCategoryRespDto> pageResult = new PageResult<>((int) pageInfo.getTotal(), pageInfo.getList());
        return pageResult;
    }

    @Override
    public boolean delete(CategoryInputDto dto) {
        Integer id = dto.getId();
        return categoryMapper.delete(id);
    }
}
