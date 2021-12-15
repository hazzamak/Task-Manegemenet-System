package com.qa.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class TaskController {
	@GetMapping(path = "getdata")
	List <taskModel> getTasks() {
		
	}
	
}
