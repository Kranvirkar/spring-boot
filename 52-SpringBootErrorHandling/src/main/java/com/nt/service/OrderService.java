package com.nt.service;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.exception.OrderServiceException;
import com.nt.model.Order;
import com.nt.repo.OrderDAO;

@Service
public class OrderService {

	@Autowired
	private OrderDAO dao;

	@PostConstruct
	public void addOrder2DB() {
		List<Order> orders = new ArrayList<>();
		orders.add(new Order(876, "Mobile", "Electronics", 8000));
		orders.add(new Order(806, "Bike", "Veichlie", 90000));
		dao.saveAll(orders);
	}

	public double getPrice(String productName) throws OrderServiceException {
		Order order = null;
		double amount = 0;
		try {
			order = dao.findByName(productName);
			amount = order.getAmount();
		} catch (Exception e) {
			throw new OrderServiceException("order not found with product : " + productName);
		}
		return amount;
	}
}
