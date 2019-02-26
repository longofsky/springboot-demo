package com.sky.springboot;

import com.battcn.swagger.annotation.EnableSwagger2Doc;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;

@MapperScan(value = "com.sky.springboot.mapper")
@EnableSwagger2Doc
//@EnableAsync
//@EnableScheduling
@SpringBootApplication
public class SpringBoot06DataMybatisApplication {



	public static void main(String[] args) {

		String test = System.getProperty("aws.secretKey");

		SpringApplication.run(SpringBoot06DataMybatisApplication.class, args);
	}
}
