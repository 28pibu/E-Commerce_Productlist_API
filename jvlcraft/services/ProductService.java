package com.jvlcode.jvlcraft.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jvlcode.jvlcraft.models.Product;
import com.jvlcode.jvlcraft.repositories.ProductRepository;

@Service 
public class ProductService {
	
	@Autowired
	private ProductRepository productRepository;
	
	public List<Product> getAllProducts(){
		return productRepository.findAll();
	}
}

