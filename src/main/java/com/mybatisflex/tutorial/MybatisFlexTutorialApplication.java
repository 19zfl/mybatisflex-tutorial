package com.mybatisflex.tutorial;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.mybatisflex.tutorial.mapper")
public class MybatisFlexTutorialApplication {

    public static void main(String[] args) {
        SpringApplication.run(MybatisFlexTutorialApplication.class);
    }

}
