package com.example.mplottery;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author wangcheng07
 */
@ServletComponentScan
@SpringBootApplication
@Configuration
@MapperScan("com.example.mplottery.mapper")
public class MpLotteryApplication {

    public static void main(String[] args) {
        SpringApplication.run(MpLotteryApplication.class, args);
    }

}
