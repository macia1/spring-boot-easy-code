package com.easy.springbooteasycode;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author macia
 */
@SpringBootApplication
@MapperScan("com.easy.springbooteasycode.dao")
public class SpringBootEasyCodeApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootEasyCodeApplication.class, args);
    }

}
