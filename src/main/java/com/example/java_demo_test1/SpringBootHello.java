package com.example.java_demo_test1;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringBootHello {
	
	
	
	@PostMapping("/")
	public String hello(){
		return "Hey, Spring Boot ªº Hello World ! ";
	}


}
