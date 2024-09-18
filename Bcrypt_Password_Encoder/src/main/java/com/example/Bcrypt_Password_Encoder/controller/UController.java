package com.example.Bcrypt_Password_Encoder.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Bcrypt_Password_Encoder.model.Users;
import com.example.Bcrypt_Password_Encoder.service.UserService;

@RestController
public class UController {

	@Autowired
	private UserService service;
	
	@PostMapping("/register")
	public Users register(@RequestBody Users user) {
		return service.register(user);
	}
}
