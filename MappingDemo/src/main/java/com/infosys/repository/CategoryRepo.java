package com.infosys.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.infosys.entities.Category;

public interface CategoryRepo extends JpaRepository<Category, Integer> {

}
