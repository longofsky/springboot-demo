package com.sky.springboot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan(value = "com.sky.springboot.mapper")
@SpringBootApplication
public class SpringBoot06DataMybatisApplication {



	public static void main(String[] args) {

		String test = System.getProperty("aws.secretKey");

		SpringApplication.run(SpringBoot06DataMybatisApplication.class, args);
	}
}
