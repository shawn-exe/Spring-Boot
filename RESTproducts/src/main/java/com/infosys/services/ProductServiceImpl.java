package com.infosys.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infosys.exception.ResourceNotFoundException;
import com.infosys.model.Products;
import com.infosys.repository.ProductsRepository;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class ProductServiceImpl implements ProductServices {

	@Autowired
	private ProductsRepository productRepo;
	
	@Override
	public Products saveProduct(Products product) {
		productRepo.save(product);
		return product;
	}

	@Override
	public List<Products> getAllProducts() {
		return productRepo.findAll();
	}

	@Override
	public Products getProductById(Long pid) {
		Optional<Products> product =  productRepo.findById(pid);
		if (product.isPresent())
		{
			return product.get();			
		}
		else
		{ 
			throw new ResourceNotFoundException("Product", "Id", pid);
		}
	}

	@Override
	public Products updateProduct(Products product, Long pid) {
		Optional<Products> existingProduct =  productRepo.findById(pid);
		if (existingProduct.isPresent())
		{
			Products p = productRepo.findById(pid).get();	
			p.setPname(product.getPname());
			p.setPcategory(product.getPcategory());
			p.setPrice(product.getPrice());
			p.setAvailable(product.getAvailable());
			productRepo.save(p);
			return p;
		}
		else {
			throw new ResourceNotFoundException("Product", "Id", pid);
		}
		
	}

	@Override
	public void deleteProduct(Long pid) {
		productRepo.deleteById(pid);
	}

}
