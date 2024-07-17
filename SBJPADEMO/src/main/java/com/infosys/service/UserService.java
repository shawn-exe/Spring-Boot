package com.infosys.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import com.infosys.entities.User;


public interface UserService {
    Page<User> findAll(Pageable page);
	
	List<User> findAll(Sort sort);
	//Try later
}
