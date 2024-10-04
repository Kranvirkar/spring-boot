package com.nt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.model.OrderDetailsEntity;
import com.nt.repo.OrderRepo;


@Service
public class Orderservice {

	
	@Autowired
	private OrderRepo repo;
	
	public String saveProduct(OrderDetailsEntity
			p) {
		return repo.save(p).getOrderId();
	}
	
	public List<OrderDetailsEntity> getAllProducts() {
		return repo.findAll();
	}
}
