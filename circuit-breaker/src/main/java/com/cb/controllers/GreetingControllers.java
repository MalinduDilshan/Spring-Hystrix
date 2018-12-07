package com.cb.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@RestController
@RequestMapping("/greeting")
public class GreetingControllers {
	
	@GetMapping
	@HystrixCommand(fallbackMethod = "defaultGreeting")
    public String getGreeting() {
        return new RestTemplate()
          .getForObject("http://localhost:9090/hello", 
          String.class);
    }
  
    private String defaultGreeting() {
        return "Hello User!";
    }

}
