package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.entity.UserEntity;
import com.repository.UserRepository;

@Controller
public class UserController {

	@Autowired
	UserRepository userRepository; 
	
	@GetMapping("/newuser")
	public String newUser() {
		return "NewUser";// jsp name
	}

	@PostMapping("/createUser")
	public String createUser(UserEntity userEntity) {
		// how to read data here -> jsp form data in controller?
		// bean class==entity class 
		
		//read ? 
		//save user info into database 
		
		//repository -> query 
		userRepository.save(userEntity);
		return "NewUser";
	}
}
