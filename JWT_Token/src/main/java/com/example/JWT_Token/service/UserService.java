package com.example.JWT_Token.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.example.JWT_Token.model.Users;
import com.example.JWT_Token.repository.UserRepo;

@Service
public class UserService {

	@Autowired
	private UserRepo repo;
	BCryptPasswordEncoder encoder = new BCryptPasswordEncoder(12);
	
	public Users register(Users user) {		
		user.setPassword(encoder.encode(user.getPassword()));
		return repo.save(user);
	}
}
