package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Primary;

@SpringBootApplication
@ComponentScan({"com.example.demo","com.test.controller"})
public class HelloWorldApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloWorldApplication.class, args);
		
//		ApplicationContext context =SpringApplication.run(HelloWorldApplication.class, args);
//		for(String bean : context.getBeanDefinitionNames() ) {
//			System.out.println(bean);
//		}
	
	
	}
	
	@Bean
	@Primary
	public User getItAdminUser() {
		return new User(1L,"Sumit Kumar","mr.sumitkr88@gmail.com",30, "ItAdmin");
	}
	
	@Bean
	public User getCustomerRepUser() {
		return new User(1L,"Sumit Kumar","mr.sumitkr88@gmail.com",30, "Customer Representative");
	}

}
