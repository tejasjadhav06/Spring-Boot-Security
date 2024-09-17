package com.example.Spring_Custom_Configuration.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Spring_Custom_Configuration.model.Student;
import com.example.Spring_Custom_Configuration.service.StudentService;

@RestController
public class StudentController {
	
	@Autowired
	StudentService service;
	@RequestMapping("/")
	public String home() {
		return "Hello World";
	}
	
	@GetMapping("/students")
	public List<Student> getAllStudents(){
		return service.getAllStudents();
	}
	
	@PostMapping("/students")
	public void addStudent(@RequestBody Student student) {
		service.addStudent(student);
	}
	
	@PutMapping("/students/{id}")
	public Student updateStudent(@RequestBody Student student) {
		return service.updateStudent(student);
	}
	
	@DeleteMapping("/students/{id}")
	public void deleteStudent(@PathVariable int id) {
		service.deleteStudent(id);
	}

}
