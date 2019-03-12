package com.sky.springboot;

import com.adachina.cfgcenter.config.BaseGenericConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource(locations={"classpath:spring.xml"})
public class SpringBoot01HelloworldQuickApplication {

	public static void main(String[] args) {

		ApplicationContext context = new SpringApplicationBuilder(SpringBoot01HelloworldQuickApplication.class).run(args);


	}
}
