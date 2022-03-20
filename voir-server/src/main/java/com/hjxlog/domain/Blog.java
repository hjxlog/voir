package com.hjxlog.domain;

import lombok.Data;

import java.sql.Timestamp;

@Data
public class Blog {

    /**
     * 主键id
     */
    private Integer id;

    /**
     * 文章标题
     */
    private String title;

    /**
     * 文章内容
     */
    private String content;

    /**
     * 分类id
     */
    private Integer categoryId;

    /**
     * 创建时间
     */
    private Timestamp createTime;

    /**
     * 更新时间
     */
    private Timestamp updateTime;

}