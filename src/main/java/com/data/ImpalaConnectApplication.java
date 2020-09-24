package com.data;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.data.mapper.impala")
public class ImpalaConnectApplication {

    public static void main(String[] args) {
        SpringApplication.run(ImpalaConnectApplication.class, args);
    }

}
