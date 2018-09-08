package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloRestController {
	
	
	@GetMapping("/hello")
	public String sayHello() {
		return "idea says hi again";
	}

	@GetMapping("/abuse")
	public String abuse() {
		return "say a lot of bad words";
	}
}
