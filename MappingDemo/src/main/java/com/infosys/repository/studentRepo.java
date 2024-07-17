package com.infosys.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.infosys.entities.Student;

public interface studentRepo extends JpaRepository<Student, Integer> {

}
