package com.hjxlog.controller;

import com.hjxlog.dto.QueryTagRespDto;
import com.hjxlog.dto.TagInputDto;
import com.hjxlog.protocol.MapResult;
import com.hjxlog.protocol.PageResult;
import com.hjxlog.protocol.Result;
import com.hjxlog.service.TagService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author Huang JX
 * @date 2022/3/19
 */
@RestController
@RequestMapping("/tag")
public class TagController {

    @Autowired
    private TagService tagService;

    /**
     * 新增标签接口
     *
     * @param dto
     * @return
     */
    @PostMapping("/add")
    @ResponseBody
    public Result add(@RequestBody TagInputDto dto) {
        MapResult<String, String> result = new MapResult<>();
        tagService.add(dto);
        return result;
    }

    /**
     * 新增标签接口
     *
     * @param dto
     * @return
     */
    @PostMapping("/update")
    @ResponseBody
    public Result update(@RequestBody TagInputDto dto) {
        MapResult<String, String> result = new MapResult<>();
        tagService.update(dto);
        return result;
    }

    /**
     * 查询标签接口
     *
     * @param dto
     * @return
     */
    @PostMapping("/list")
    @ResponseBody
    public Result list(@RequestBody TagInputDto dto) {
        Result result = new Result();
        PageResult<QueryTagRespDto> pageResult = tagService.list(dto);
        result.setBody(pageResult);
        return result;
    }

    /**
     * 删除标签接口
     *
     * @param dto
     * @return
     */
    @PostMapping("/delete")
    @ResponseBody
    public Result delete(@RequestBody TagInputDto dto) {
        Result result = new Result();
        tagService.delete(dto);
        return result;
    }

}
