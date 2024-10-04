package com.nt.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nt.model.Customer;
import com.nt.model.Product;
import com.nt.repo.CustomerRepository;
import com.nt.repo.ProductRepository;

@RestController
public class MRestController {

	@Autowired
	private ProductRepository productRepo;

	@Autowired
	private CustomerRepository customerRepo;
	
	@GetMapping("/products")
	public List<Product> getProducts(){
		return productRepo.findAll();
	}
	@GetMapping("/customers")
	public List<Customer> getCustomer(){
		return customerRepo.findAll();
	}

}
