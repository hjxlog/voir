package com.hjxlog.controller;

import com.hjxlog.dto.*;
import com.hjxlog.protocol.MapResult;
import com.hjxlog.protocol.PageResult;
import com.hjxlog.protocol.Result;
import com.hjxlog.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * 分类管理
 *
 * @author Huang JX
 * @date 2022/3/19
 */
@RestController
@RequestMapping("/category")
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    /**
     * 新增分类接口
     *
     * @param dto
     * @return
     */
    @PostMapping("/add")
    @ResponseBody
    public Result add(@RequestBody CategoryInputDto dto) {
        MapResult<String, String> result = new MapResult<>();
        if(dto.getId()!=null){
            result.setCode("1");
            result.setMsg("该分类已存在");
        }
        categoryService.add(dto);
        return result;
    }

    /**
     * 新增分类接口
     *
     * @param dto
     * @return
     */
    @PostMapping("/update")
    @ResponseBody
    public Result update(@RequestBody CategoryInputDto dto) {
        MapResult<String, String> result = new MapResult<>();
        categoryService.update(dto);
        return result;
    }

    /**
     * 查询分类接口
     *
     * @param dto
     * @return
     */
    @PostMapping("/list")
    @ResponseBody
    public Result list(@RequestBody CategoryInputDto dto) {
        Result result = new Result();
        PageResult<QueryCategoryRespDto> pageResult = categoryService.list(dto);
        result.setBody(pageResult);
        return result;
    }

    /**
     * 删除分类接口
     *
     * @param dto
     * @return
     */
    @PostMapping("/delete")
    @ResponseBody
    public Result delete(@RequestBody CategoryInputDto dto) {
        Result result = new Result();
        categoryService.delete(dto);
        return result;
    }

}
