package com.nt.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/springActuator/api")
public class MyController {

	@GetMapping("/test")
	public String showPage() {
		return "Actuator Home";
	}
}
