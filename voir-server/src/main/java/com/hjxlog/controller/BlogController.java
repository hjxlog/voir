package com.hjxlog.controller;

import cn.hutool.json.JSON;
import cn.hutool.json.JSONUtil;
import com.hjxlog.dto.QueryBlogReqDto;
import com.hjxlog.dto.QueryBlogRespDto;
import com.hjxlog.dto.SaveBlogDto;
import com.hjxlog.protocol.MapResult;
import com.hjxlog.protocol.PageResult;
import com.hjxlog.protocol.Result;
import com.hjxlog.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * 博客管理
 *
 * @author Huang JX
 * @date 2022/3/19
 */
@RestController
@RequestMapping("/blog")
public class BlogController {

    @Autowired
    private BlogService blogService;

    /**
     * 新增博客接口
     *
     * @param dto
     * @return
     */
    @PostMapping("/add")
    @ResponseBody
    public Result add(@RequestBody SaveBlogDto dto) {
        MapResult<String, String> result = new MapResult<>();
        blogService.add(dto);
        return result;
    }

    /**
     * 新增博客接口
     *
     * @param dto
     * @return
     */
    @PostMapping("/update")
    @ResponseBody
    public Result update(@RequestBody SaveBlogDto dto) {
        MapResult<String, String> result = new MapResult<>();
        blogService.update(dto);
        return result;
    }

    /**
     * 查询博客接口
     *
     * @param dto
     * @return
     */
    @PostMapping("/list")
    @ResponseBody
    public Result list(@RequestBody QueryBlogReqDto dto) {
        Result result = new Result();
        PageResult<QueryBlogRespDto> pageResult = blogService.list(dto);
        result.setBody(pageResult);
        return result;
    }

    /**
     * 删除博客接口
     *
     * @param dto
     * @return
     */
    @PostMapping("/delete")
    @ResponseBody
    public Result delete(@RequestBody QueryBlogReqDto dto) {
        Result result = new Result();
        blogService.delete(dto);
        return result;
    }

}
