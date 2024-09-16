package com.example.Spring_Boot_CSRF_Token.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.Spring_Boot_CSRF_Token.model.Student;

@Service
public class StudentService {

	List<Student> students = Arrays.asList(new Student(101,"Tejas",89),
			new Student(102,"Shubham",90));
	
	public List<Student> getAllStudents(){
		return students;
	}
}
