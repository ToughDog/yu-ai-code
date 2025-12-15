package com.yupi.yuaicode;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@MapperScan("com.yupi.yuaicode.mapper")
public class YuAiCodeApplication {

    public static void main(String[] args) {
        SpringApplication.run(YuAiCodeApplication.class, args);
    }

}
