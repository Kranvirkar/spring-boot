package in.nit.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import in.nit.model.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {
	
	Customer findByEmail(String theEmail);
}