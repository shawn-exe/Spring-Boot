package com.infosys.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.infosys.entity.Employee;
import com.infosys.repository.EmpRepo;
@Service
public class EmpServiceImpl implements EmpService {

	@Autowired
	private EmpRepo empRepo;
	
	@Override
	public Page<Employee> findAll(Pageable page) {
		// TODO Auto-generated method stub
		return empRepo.findAll(page);
	}

	@Override
	public List<Employee> findAll(Sort sort) {
		// TODO Auto-generated method stub
		return empRepo.findAll(sort);
	}
}

