package com.infosys.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.infosys.entity.Employee;

public interface EmpRepo extends JpaRepository<Employee, Integer>
{

}