package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	@GetMapping("/")
	public String HelloWorld() {
		
		return "HelloWorld !!!";
	}

	@Value("${admin.name}")
	private String adminName;
	
	@GetMapping("/admin")
	public String getAdminName() {
		return adminName;
	}

}
