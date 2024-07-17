package com.infosys.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import com.infosys.entity.Employee;

public interface EmpService {

	Page<Employee> findAll(Pageable page);
	
	List<Employee> findAll(Sort sort);
}
