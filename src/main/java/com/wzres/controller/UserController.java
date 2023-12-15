package com.wzres.controller;

import com.wzres.domain.User;
import com.wzres.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @ClassName UserController
 * @date 2023-12-16 00:56
 */
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/list")
    public void selectAll(){
        List<User> list = userService.selectAll();
        System.out.println(list);
    }

}
