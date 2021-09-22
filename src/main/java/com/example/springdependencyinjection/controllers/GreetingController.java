package com.example.springdependencyinjection.controllers;

import org.springframework.stereotype.Controller;

@Controller
public class GreetingController {

	public String getGreeting(){
		return "Hello World";
	}
}
