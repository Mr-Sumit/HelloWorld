package com.example.demo;

public class User {
	Long id;
	String name;
	String email;
	Integer age;
	String role;
	
	public User() {
		super();
		
	}

	public User(Long id, String name, String email, Integer age, String role) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.age = age;
		this.role = role;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}
	
	
}
