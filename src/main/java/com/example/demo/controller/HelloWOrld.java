package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/app")
public class HelloWOrld {

	
	
	@GetMapping("/hello")
	public String hello()
	{
		return "helloWorld";
		
	}
	
	

	@GetMapping("/spring")
	public String  springboot()
	{
		return "springboot";
		
	}
	
	
}
