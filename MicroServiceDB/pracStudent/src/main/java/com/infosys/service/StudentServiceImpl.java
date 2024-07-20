package com.infosys.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infosys.exception.ResourceNotFoundException;
import com.infosys.model.Student;
import com.infosys.repository.StudentRepository;

import jakarta.transaction.Transactional;


@Service
@Transactional
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentRepository stuRepo;
	
	@Override
	public Student savStudent(Student student) {
		stuRepo.save(student);
		return student;
	}

	@Override
	public List<Student> getAllStudents() {
		// TODO Auto-generated method stub
		return stuRepo.findAll();
	}

	@Override
	public Student getStudentById(Long id) {
		// TODO Auto-generated method stub
		Optional<Student> student =  stuRepo.findById(id);
		if (student.isPresent())
		{
			return student.get();			
		}
		else
		{ 
			throw new ResourceNotFoundException("student", "Id", id);
		}
		
	}

	@Override
	public Student updateStudent(Student student, Long id) {
		// TODO Auto-generated method stub
		Student existStu=stuRepo.findById(id).orElseThrow(()->
		new ResourceNotFoundException("student", "Id", id));
		existStu.setName(student.getName());
		existStu.setUsn(student.getUsn());
		stuRepo.save(existStu);
		return existStu;
	}

	@Override
	public void deleteStudent(Long id) {
		stuRepo.deleteById(id);		
		
	}

}
