package com.nt;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.nt.model.Customer;
import com.nt.model.Product;
import com.nt.repo.CustomerRepository;
import com.nt.repo.ProductRepository;

@SpringBootApplication
public class Application implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);


	}

	@Autowired
	private ProductRepository productRepo;
	@Autowired
	private CustomerRepository customerRepo;
	public void run(String... args) throws Exception {
		productRepo.saveAll(
				Arrays.asList(
						new Product(101, "P-1", "PEN"),
						new Product(102, "P-2", "BOOK"),
						new Product(103, "P-3", "TEST")
						)
				);
		customerRepo.saveAll(
				Arrays.asList(
						new Customer(550, "sam@gmail.com", "sam"),
						new Customer(551, "ram@gmail.com", "ram"),
						new Customer(552, "khan@gmail.com", "khan")
						)
				);
	}
}

