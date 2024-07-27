package com.wzres.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName TestController
 * @date 2024-07-18 13:21
 */
@RestController
public class TestController {

    @GetMapping("test")
    public String test() {
        return "helloSecurity";
    }
}
