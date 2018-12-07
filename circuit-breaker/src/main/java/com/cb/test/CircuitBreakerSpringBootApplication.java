package com.cb.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
@EnableHystrix
@EnableHystrixDashboard
@ComponentScan(basePackages = "com.cb.*")
public class CircuitBreakerSpringBootApplication {
	public static void main(String[] args){
		SpringApplication.run(CircuitBreakerSpringBootApplication.class, args);
	}
}
