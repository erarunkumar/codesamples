package com.training.spring.web;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	
	@RequestMapping("/home")
	public String greetMessage(){
		return "Welcome to Spring Boot";
	}
	@RequestMapping("/home/{name}")
	public String greetUser(@PathVariable("name") String username) {
		return "Hello " + username;
	}
}
