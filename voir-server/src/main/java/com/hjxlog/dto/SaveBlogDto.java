package com.hjxlog.dto;

import lombok.Data;

import java.util.List;

/**
 * @author Huang JX
 * @date 2022/3/19
 */
@Data
public class SaveBlogDto {

    private Integer id;

    private String title;

    private String content;

    private Integer categoryId;

    private List<Integer> tagIdList;

}
