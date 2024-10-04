package com.nt.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nt.model.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {

	
}
