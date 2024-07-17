package com.infosys.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import com.infosys.entities.User;
import com.infosys.repositories.UserRepo;

public class UserServiceImpl  implements UserService{

	@Autowired
	private UserRepo userRepo;
	
	@Override
	public Page<User> findAll(Pageable page) {
		// TODO Auto-generated method stub
		return userRepo.findAll(page);
		///Try later
	}

	@Override
	public List<User> findAll(Sort sort) {
		// TODO Auto-generated method stub
		return null;
	}

}
