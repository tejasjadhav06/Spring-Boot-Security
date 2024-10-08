package com.example.Spring_Boot_CSRF_Token.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.stereotype.Service;

import com.example.Spring_Boot_CSRF_Token.model.Student;

import jakarta.servlet.http.HttpServletRequest;

@Service
public class StudentService {

	List<Student> students = new ArrayList(Arrays.asList(new Student(101,"Tejas",89),
			new Student(102,"Shubham",90)));
	
	public List<Student> getAllStudents(){
		return students;
	}

	public void addStudent(Student student) {
		students.add(student);
	}

	public CsrfToken getCsrfToken(HttpServletRequest request) {
		return (CsrfToken) request.getAttribute("_csrf");
	}
}
