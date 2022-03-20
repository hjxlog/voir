package com.hjxlog.dto;

import com.hjxlog.domain.Category;
import com.hjxlog.domain.Tag;
import lombok.Data;

import java.sql.Timestamp;
import java.util.List;

/**
 * @author Huang JX
 * @date 2022/3/19
 */
@Data
public class QueryBlogRespDto {

    private Integer id;

    private String title;

    private String content;

    private Category category;

    private List<Tag> tagList;

    private Timestamp updateTime;

}
