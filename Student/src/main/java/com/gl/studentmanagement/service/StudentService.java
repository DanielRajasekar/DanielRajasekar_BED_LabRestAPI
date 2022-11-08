package com.gl.studentmanagement.service;

import java.util.List;

import com.gl.studentmanagement.entity.Student;

public interface StudentService {

	List<Student> findAll();

	Student findById(int theId);

	void save(Student theStudent);

	void deleteById(int theId);

}
