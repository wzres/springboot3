package com.wzres.mapper;

import com.wzres.domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @ClassName UserMapper
 * @date 2023-12-16 01:01
 */
@Mapper
public interface UserMapper {

    @Select("select * from t_user")
    List<User> list();

    @Select("select * from t_user")
    List<User> selectAll();
}
