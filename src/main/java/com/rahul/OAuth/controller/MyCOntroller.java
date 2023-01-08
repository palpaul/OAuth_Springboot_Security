package com.rahul.OAuth.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyCOntroller {

	@GetMapping("/")
	public String getMsg() {
		return "Hey welcome to OAuth";
	}
	
}

