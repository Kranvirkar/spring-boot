package com.nt.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.nt.model.OrderDetailsEntity;
import com.nt.service.Orderservice;

@RestController
public class HomeController {

	@Autowired
	private Orderservice service;
	
	@GetMapping("/")
	private List<OrderDetailsEntity> getAllBooks()   
	{  
	return service.getAllProducts();  
	}  
	
	@PostMapping("/save")
	private String saveBook(@RequestBody OrderDetailsEntity books)   
	{  
	service.saveProduct(books);  
	return books.getOrderId();  
	} 
}
