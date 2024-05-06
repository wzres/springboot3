package com.wzres;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @ClassName UserApplication
 * @date 2023-12-16 00:55
 */

@SpringBootApplication
@Slf4j
public class ExampleApplication {
    public static void main(String[] args) {
        //log.info("启动成功");
        SpringApplication.run(ExampleApplication.class, args);
    }
}
