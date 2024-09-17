package com.example.Spring_Custom_Configuration.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Spring_Custom_Configuration.model.Student;

@Repository
public interface StudentRepo extends JpaRepository<Student, Integer> {

}
