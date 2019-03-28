package com.lyf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = {"com.lyf.controller", "com.lyf.service", "com.lyf.config"})
@SpringBootApplication
public class FindjobApplication {

	public static void main(String[] args) {
		SpringApplication.run(FindjobApplication.class, args);
	}
}
