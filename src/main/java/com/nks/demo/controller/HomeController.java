package com.nks.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nks.demo.entity.Employee;

@RestController
public class HomeController {

	private Employee emp; 
	
	public HomeController() {
		super();
		emp = new Employee(1,"Nirmal",33);
	}

	@RequestMapping("/emp")
	public Employee getEmployee() {
		return emp;
	}
	
	@RequestMapping("/")
	public String getWelcome() {
		return "Welcome to my page";
	}
	
	@RequestMapping("/login")
	public String getLogin() {
		return "login";
	}
	
	@RequestMapping("/logout-success")
	public String getLogout() {
		return "logout";
	}
}
