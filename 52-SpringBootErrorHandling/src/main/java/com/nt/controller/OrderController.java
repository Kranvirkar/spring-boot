package com.nt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.nt.exception.OrderServiceException;
import com.nt.service.OrderService;

@Controller
public class OrderController {

	@Autowired
	private OrderService service;

	@GetMapping("/getPrice/{productName}")
	public String getOrderPrice(@PathVariable String productName) throws OrderServiceException {
		double amount = service.getPrice(productName);
		return "amount for product " + productName + " is " + amount;
	}
}
