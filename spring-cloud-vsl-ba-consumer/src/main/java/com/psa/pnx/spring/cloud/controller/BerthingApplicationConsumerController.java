package com.psa.pnx.spring.cloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class BerthingApplicationConsumerController {
	@Autowired
	private RestTemplate restTemplate;

	@GetMapping("/vsl/ba/{id}")
	//@HystrixCommand(fallbackMethod = "findByIdFallback")
	public String findById(@PathVariable Long id) {
		return this.restTemplate.getForObject("http://microservice-vsl-ba/vsl/ba/" + id, String.class);
	}

	public String findByIdFallback(Long id) {
		return "";
	}
}
