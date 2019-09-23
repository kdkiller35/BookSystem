package com.woniuxy.app;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.woniuxy")
@MapperScan("com.woniuxy.dao")
public class App {
	public static void main(String[] args) {
		SpringApplication.run(App.class, args); 
	}
}
