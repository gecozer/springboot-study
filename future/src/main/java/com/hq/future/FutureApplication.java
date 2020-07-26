package com.hq.future;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan(basePackages = {"com.hq.future.dao"})
@SpringBootApplication
public class FutureApplication {

    public static void main(String[] args) {
        SpringApplication.run(FutureApplication.class, args);
    }

}
