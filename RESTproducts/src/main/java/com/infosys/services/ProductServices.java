package com.infosys.services;

import java.util.List;

import com.infosys.model.Products;

public interface ProductServices {

	Products saveProduct(Products product);
	
	List<Products> getAllProducts();
	
	Products getProductById(Long pid);
	
	Products updateProduct(Products product, Long pid);
	
	void deleteProduct(Long pid);
}
