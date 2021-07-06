package com.example.service;

import java.util.List;

import com.example.model.Student;

public interface StudentService {

	public Object saveStudent(Student student);
	
	public List<Student> getAllStudent();
	
	public Student getStudentById(int id);
	
	public Object updateStudent(Student student);
	public List<Student> getAllStudentByCollegeName(Student student);
	public Object getNames();
}
