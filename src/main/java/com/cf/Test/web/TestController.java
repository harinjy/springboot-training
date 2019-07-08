package com.cf.Test.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	@GetMapping
	public String welcome()
	{
		return "Welcome to the world of Spring Boot!!!";
	}

}
