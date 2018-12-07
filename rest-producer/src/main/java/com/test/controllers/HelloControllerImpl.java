package com.test.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloControllerImpl implements HelloController {

	@GetMapping
	public String getHelloWorld() {
		return "Hello World";
	}
}
