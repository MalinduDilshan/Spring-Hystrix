package com.test.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.test.*")
public class RestProducerSpringBootApplication {
	public static void main(String[] args){
		SpringApplication.run(RestProducerSpringBootApplication.class, args);
	}
}
