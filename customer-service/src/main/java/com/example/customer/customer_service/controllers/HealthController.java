package com.example.customer.customer_service.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthController {
	
	@GetMapping("/health")
	public String healthCheck() {
		return "Customer Service is setup and running fine";
	}

}