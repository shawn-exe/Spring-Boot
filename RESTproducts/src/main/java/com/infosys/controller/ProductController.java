package com.infosys.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.infosys.model.Products;
import com.infosys.services.ProductServices;

@RestController
@RequestMapping("/api/products")
public class ProductController {

	@Autowired
	private ProductServices productServices;
	
	@DeleteMapping("{id}")
	public ResponseEntity<String> deleteProduct(@PathVariable("id")Long pid )
	{
		productServices.deleteProduct(pid);
		return new ResponseEntity<String>("Product Deleted Successfully",HttpStatus.OK);
	}
	@PutMapping("{id}")
	public ResponseEntity<Products> updateProduct(@PathVariable("id")Long pid , @RequestBody Products products)
	{
		return new ResponseEntity<Products>(productServices.updateProduct(products,pid),HttpStatus.OK);
		
	}
	
	@GetMapping
	public List<Products> getAllProducts()
	{
		return productServices.getAllProducts();
	}
	
	
	@PostMapping
	public ResponseEntity<Products> saveProduct(@RequestBody Products products)
	{
		return new ResponseEntity<Products>(productServices.saveProduct(products),HttpStatus.CREATED);
	}
	
	@GetMapping("{id}")
	public ResponseEntity<Products> getProductsById(@PathVariable("id")Long pid)
	{
		return new ResponseEntity<Products>(productServices.getProductById(pid),HttpStatus.OK);
	}
	
}
