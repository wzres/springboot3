package com.wzres;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * @ClassName UserApplication
 * @date 2023-12-16 00:55
 */

@SpringBootApplication
@Slf4j
public class ExampleApplication {
    public static void main(String[] args) {
        //log.info("启动成功");
        ConfigurableApplicationContext run = SpringApplication.run(ExampleApplication.class, args);
        System.out.println(123);
    }
}
