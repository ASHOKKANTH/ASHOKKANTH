package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Product;
import com.example.demo.service.ProductService;

@RestController
public class ProductController {
	@Autowired
	private ProductService service;
@PostMapping("/addProduct")
	public Product addProduct(@RequestBody Product product) {
		return service.addProduct(product);
	}
@GetMapping("/getProduct/{id}")
    public Product getProduct(@PathVariable int id) {
    	return service.getProduct(id);
    }
@PutMapping("/updateProduct")
    public Product updateProduct(@RequestBody Product product) {
    	return service.upsertProduct(product);
    	
    }
@DeleteMapping("/deleteProduct/{id}")
    public String deleteProduct(@PathVariable int id) {
    	return service.deleteProduct(id);
    	
    }
    


}
