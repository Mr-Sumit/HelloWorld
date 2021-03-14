package com.test.controller;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.User;

@RestController
@RequestMapping("second")
public class SecondHomeController {
	
	@Autowired
	@Qualifier("getItAdminUser")
	private User user;
	
	@Autowired
	@Qualifier("getCustomerRepUser")
	private User customerRepUser;
	
	@Value("${admin.name}")
	private String adminName;
	
	@GetMapping("/")
	public String HelloWorld() {
		return "HelloWorld !!!";
	}

	
	@GetMapping("/admin")
	public String getAdminName() {	
		return adminName;
	}
	
	@GetMapping("/itadmin")
	public User getItAdmin(){
		return user;
		
	}

}
