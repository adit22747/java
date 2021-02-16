package com.example;


import org.springframework.web.bind.annotation.GetMapping;

public class AdminController {
	
	
	@GetMapping(path = "/admin")
	public String getAdmin() {
		return "admin";
	}
}
