package com.example.helloworld.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldControler {
	
	@RequestMapping(value = "/hello")
	public String hello() {
		return "Hi";
	}

	@RequestMapping(value = "/hi")
	public String hi() {
		return "Hello";
	}

	@RequestMapping(value = "")
	public String HelloWorld() {
		return "Hello World";
	}

}
