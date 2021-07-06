package com.example.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.model.Student;

@Repository
public interface StudentRepo extends JpaRepository<Student, Integer>{

	//@Query("select u from Student where u.collegeName=collegeName")
	List<Student> getStudentByCollegeName(@Param("collegeName") String collegeName);

}
