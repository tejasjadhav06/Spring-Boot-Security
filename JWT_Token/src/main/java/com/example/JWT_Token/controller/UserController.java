package com.example.JWT_Token.controller;

import java.util.ArrayList;
import java.util.Arrays;
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

import com.example.JWT_Token.model.Student;
import com.example.JWT_Token.model.Users;
import com.example.JWT_Token.service.UserService;

@RestController
public class UserController {
	
	@Autowired
	private UserService service;
	
	List<Student> students = new ArrayList(Arrays.asList(new Student(101,"Rakesh",89),new Student(102,"Rahul",85)));
	
	@RequestMapping("/")
	public String home() {
		return "Hello This is our Home Page";
	}
	
	@GetMapping("/students")
	public List<Student> getAllStudents(){
		return students;
	}
	
	@GetMapping("/students/{id}")
	public Student getStudentById(@PathVariable int id) {
		return students.stream()
				.filter(p -> p.getId() == id)
				.findFirst().get();
	}
	@PostMapping("/students")
	public void addStudent(@RequestBody Student student) {
		students.add(student);
	}
	
	@PutMapping("/students/{id}")
	public Student updateStudent(@PathVariable int id, @RequestBody Student student) {
		Student s = getStudentById(id);
		s.setId(student.getId());
		s.setName(student.getName());
		s.setMarks(student.getMarks());
		return student;
	}
	
	@DeleteMapping("/students/{id}")
	public void deleteStudent(@PathVariable int id) {
		Student s = getStudentById(id);
		int index = students.indexOf(s);
		students.remove(index);
	}
	
	@PostMapping("/register")
	public Users register(@RequestBody Users user) {
		return service.register(user);
	}
	
	@PostMapping("/login")
	public String verify(@RequestBody Users user) {
		return service.verify(user);
	}
}