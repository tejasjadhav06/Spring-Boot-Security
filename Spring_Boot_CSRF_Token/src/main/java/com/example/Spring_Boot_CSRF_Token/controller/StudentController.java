package com.example.Spring_Boot_CSRF_Token.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Spring_Boot_CSRF_Token.model.Student;
import com.example.Spring_Boot_CSRF_Token.service.StudentService;

import jakarta.servlet.http.HttpServletRequest;

@RestController
public class StudentController {

	@Autowired
	StudentService service;
	
	@RequestMapping("/")
	public String home() {
		return "This is a Home Page of Our Application.";
	}
	
	@GetMapping("/students")
	public List<Student> getAllStudents(){
		return service.getAllStudents();
	}
	
	@GetMapping("/csrf-token")
	public CsrfToken getCsrfToken(HttpServletRequest request) {
		return service.getCsrfToken(request);
	}
	
	@PostMapping("/students")
	public void addStudent(@RequestBody Student student) {
		service.addStudent(student);
	}
}
