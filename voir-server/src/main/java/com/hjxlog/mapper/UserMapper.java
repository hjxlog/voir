package com.hjxlog.mapper;

import com.hjxlog.domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface UserMapper {

    boolean delete(Integer id);

    boolean insert(User record);

    User select(Integer id);

    boolean update(User record);

}