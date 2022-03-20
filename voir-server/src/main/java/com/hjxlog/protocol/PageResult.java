package com.hjxlog.protocol;

import lombok.Data;

import java.util.List;

/**
 * @author Huang JX
 * @date 2022/3/19
 */
@Data
public class PageResult<T> {
    private Integer total;
    private List<T> data;

    public PageResult(Integer total, List<T> data) {
        this.total = total;
        this.data = data;
    }

}
