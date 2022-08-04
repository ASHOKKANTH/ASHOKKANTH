package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Product;
import com.example.demo.repository.ProductRepository;

@Service
public class ProductService {
@Autowired
	private ProductRepository repository;
  public Product addProduct(Product product) {
	  
	  return repository.save(product);
  }
  public Product getProduct(int id) {
	  
	  return repository.findById(id).orElse(null);
  }
  public Product upsertProduct(Product product) {
	  
	  return repository.save(product);
	  
  }
  public String deleteProduct(int id) {
	  
	  repository.deleteById(id);
	  return"obj deleted";

  }



}
