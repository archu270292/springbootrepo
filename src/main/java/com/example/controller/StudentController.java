package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Student;
import com.example.service.StudentService;

@RestController
public class StudentController {
	
	@Autowired
	private StudentService studentservice;
	
	
	@RequestMapping(value="/saveStudent",method=RequestMethod.POST)
	//@PostMapping("/saveStudent")
	public Object insertStudent(@RequestBody Student student)
	{
		return studentservice.saveStudent(student);
	}
	
	@GetMapping("/getStudents")
	public List<Student> getAllStudent()
	{
		return studentservice.getAllStudent();
	}
	@GetMapping("/getStudents/{id}")
	public Student getStudentById(@PathVariable int id)
	{
		return studentservice.getStudentById(id);
	}

	@PutMapping("/updateStudent")
	public Object updateStudent(@RequestBody Student student)
	{
		return studentservice.updateStudent(student);
	}
	
	@PostMapping("/getStudentByCollegeName")
	public List<Student> getStudentByCollege(@RequestBody Student student)
	{
		return studentservice.getAllStudentByCollegeName(student);
	}
	
	@GetMapping("/getName")
	public Object getName()
	{
		return studentservice.getNames();
	}
	
	
}
