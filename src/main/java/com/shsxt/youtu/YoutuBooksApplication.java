package com.shsxt.youtu;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.shsxt.youtu.mapper")
public class YoutuBooksApplication {

    public static void main(String[] args) {
        SpringApplication.run(YoutuBooksApplication.class, args);
    }

}
