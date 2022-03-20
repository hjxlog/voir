package com.hjxlog.dto;

import lombok.Data;

/**
 * @author Huang JX
 * @date 2022/3/19
 */
@Data
public class QueryBlogReqDto {

    private Integer id;

    private String title;

    private String content;

    private Integer categoryId;

    private Integer tagId;

    private Integer pageNum;

    private Integer pageSize;

}
