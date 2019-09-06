package com.simian.demo_vhr;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@MapperScan("com.simian.demo_vhr.mapper")
@EnableCaching
public class DemoVhrApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoVhrApplication.class, args);
    }

}
