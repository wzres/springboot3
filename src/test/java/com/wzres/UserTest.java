package com.wzres;

import com.wzres.domain.User;
import com.wzres.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

/**
 * @ClassName UserTest
 * @date 2023-12-16 01:04
 */
@SpringBootTest
public class UserTest {

    @Autowired
    private UserMapper userMapper;

    @Test
    public void testList(){
        List<User> list = userMapper.list();
        System.out.println(list);
    }

}
