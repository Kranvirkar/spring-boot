package com.ducat.spring.security.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/rest/auth")
public class Mycontroller {

	// The method will only be accessed by the user who has 'admin' role attached to it.
	@GetMapping(value="/getmsg")
	public String getmsg() {
		System.out.println(getClass() + "- showing admin welcome page to the user.");
		return "Spring security - Role based access example!";
	}
}