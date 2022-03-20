package com.hjxlog.dto;

import lombok.Data;

import java.util.List;

/**
 * @author Huang JX
 * @date 2022/3/19
 */
@Data
public class CategoryInputDto {

    private Integer id;

    private String name;

    private Integer pageNum;

    private Integer pageSize;

}
