package com.nt.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nt.model.Order;

public interface OrderDAO extends JpaRepository<Order, Integer> {

	Order findByName(String name);
}
