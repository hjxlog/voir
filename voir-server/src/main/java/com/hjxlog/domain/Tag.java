package com.hjxlog.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import java.sql.Timestamp;

@Data
public class Tag {

    /**
     * 主键id
     */
    private Integer id;

    /**
     * 标签名称
     */
    private String name;

    /**
     * 创建时间
     */
    @JsonIgnore
    private Timestamp createTime;

    /**
     * 更新时间
     */
    @JsonIgnore
    private Timestamp updateTime;

}