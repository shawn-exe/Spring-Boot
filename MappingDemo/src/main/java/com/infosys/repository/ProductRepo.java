package com.infosys.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.infosys.entities.Product;

public interface ProductRepo extends JpaRepository<Product, Integer>{

}
