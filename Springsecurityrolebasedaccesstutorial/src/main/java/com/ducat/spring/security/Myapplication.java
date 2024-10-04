package com.ducat.spring.security;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

@SpringBootApplication
@EnableWebSecurity
public class Myapplication {

	public static void main(String[] args) {
		SpringApplication.run(Myapplication.class, args);
	}
}