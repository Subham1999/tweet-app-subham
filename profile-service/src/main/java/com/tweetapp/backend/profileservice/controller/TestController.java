package com.tweetapp.backend.profileservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	@GetMapping("/ping")
	public String sayHello() {
		return "pong";
	}
}
