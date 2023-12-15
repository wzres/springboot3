package com.wzres.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wzres.domain.User;
import com.wzres.service.UserService;
import com.wzres.mapper.UserMapper;
import org.springframework.stereotype.Service;

/**
* @author wz
* @description 针对表【t_user】的数据库操作Service实现
* @createDate 2023-12-16 01:49:38
*/
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User>
    implements UserService{

}




