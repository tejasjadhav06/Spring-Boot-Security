package com.example.Bcrypt_Password_Encoder.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import com.example.Bcrypt_Password_Encoder.model.Users;
import com.example.Bcrypt_Password_Encoder.repository.UserRepo;

@Service
public class UserService {

	@Autowired
	private UserRepo repo;
	
	private BCryptPasswordEncoder encoder = new BCryptPasswordEncoder(12);
	
	public Users register(Users user) {
		user.setPassword(encoder.encode(user.getPassword()));
		return repo.save(user);
	}
}
