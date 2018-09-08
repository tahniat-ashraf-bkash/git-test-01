package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {
	
	@GetMapping(value="/")
	public String sayHello() {
		return "eclipse says hi";
	}

}
