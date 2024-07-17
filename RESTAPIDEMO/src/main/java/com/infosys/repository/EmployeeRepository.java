package com.infosys.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.infosys.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}
