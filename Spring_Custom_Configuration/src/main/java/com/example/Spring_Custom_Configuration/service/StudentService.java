package com.example.Spring_Custom_Configuration.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Spring_Custom_Configuration.model.Student;
import com.example.Spring_Custom_Configuration.repository.StudentRepo;

@Service
public class StudentService {

	@Autowired
	private StudentRepo repo;
	
	public List<Student> getAllStudents(){
		return repo.findAll();
	}
	
	public Student getStudentById(int id) {
	return repo.findById(id).get();
	}
	
	public void addStudent(Student student) {
		repo.save(student);
	}

	public Student updateStudent(Student student) {
		repo.save(student);
		return student;
	}
	
	public void deleteStudent(int id) {
		repo.deleteById(id);
	}

}
