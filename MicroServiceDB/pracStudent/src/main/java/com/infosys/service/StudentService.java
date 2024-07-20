package com.infosys.service;

import java.util.List;

import com.infosys.model.Student;

public interface StudentService {
Student savStudent(Student student);
	
	List<Student> getAllStudents();
	
	Student getStudentById(Long id);
	
	Student updateStudent(Student student, Long id);
	
	void deleteStudent(Long id);
}
