package com.pancancer;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.pancancer.dao")
public class MutationApplication {

    public static void main(String[] args) {
        SpringApplication.run(MutationApplication.class, args);
    }

}
