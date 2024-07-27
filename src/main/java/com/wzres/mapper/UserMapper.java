package com.wzres.mapper;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.wzres.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @ClassName UserMapper
 * @date 2023-08-18 17:10
 */

@Mapper
public interface UserMapper extends BaseMapper<User> {

}
