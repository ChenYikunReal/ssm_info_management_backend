package com.train.info;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@MapperScan(basePackages = "com.train.info.dao")
@EnableSwagger2
public class StudentInfoApplication {

    public static void main( String[] args ) {
        SpringApplication.run(StudentInfoApplication.class, args);
    }

}
