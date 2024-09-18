package com.example.Verify_User.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Verify_User.model.Users;

@Repository
public interface UserRepo extends JpaRepository<Users, Integer>{

}
