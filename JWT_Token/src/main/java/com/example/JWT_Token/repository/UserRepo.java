package com.example.JWT_Token.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.JWT_Token.model.Users;


@Repository
public interface UserRepo extends JpaRepository<Users, Integer>{

	Users findByUsername(String username);

}