package com.example.serviceImpl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.model.Student;
import com.example.repository.StudentRepo;
import com.example.service.StudentService;
@Service
public class StudentServiceImpl implements StudentService {
	
	@Autowired
	private StudentRepo studentrepo;

	@Override
	@Transactional
	public Object saveStudent(Student student) {
		Map<String,String>map=new HashMap();
		if(student.getName().isEmpty())
		{
			map.put("status", "error");
			map.put("msg", "please enter the name");
		}
		else
		{
			map.put("status", "200");
			map.put("msg", "success");
			studentrepo.save(student);
		}
		
		
		return map;
	}

	@Override
	@Transactional
	public List<Student> getAllStudent() {
		
		return studentrepo.findAll();
	}

	@Override
	@Transactional
	public Student getStudentById(int id) {
		
		return studentrepo.findById(id).orElse(null);
	}

	@Override
	@Transactional
	public Object updateStudent(Student student) {
		Map<String,String>map=new HashMap();
		if(student.getName().isEmpty())
		{
			map.put("status", "error");
			map.put("msg", "please enter the name");
		}
		else
		{
			map.put("status", "200");
			map.put("msg", "success");
			studentrepo.saveAndFlush(student);
		}
		
		
		return map;

	}

	@Override
	@Transactional
	public List<Student> getAllStudentByCollegeName(Student student) {
		
		return studentrepo.getStudentByCollegeName(student.getCollegeName());
	}

	@Override
	@Transactional
	public Object getNames() {
		Map<String,Object> map=new HashMap<String,Object>();
		map.put("name", "amrita");
		return map;
	}

}
