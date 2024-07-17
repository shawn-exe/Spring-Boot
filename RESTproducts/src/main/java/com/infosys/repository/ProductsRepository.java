package com.infosys.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.infosys.model.Products;

public interface ProductsRepository extends JpaRepository<Products, Long> {

}
