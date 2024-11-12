package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {
	
	@GetMapping("/newuser")
	public String newUser() {
		return "NewUser";// jsp name
	}
}
