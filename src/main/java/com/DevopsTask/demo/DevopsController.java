package com.DevopsTask.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class DevopsController {
	@GetMapping(value="get")
	public String get() {
		return "Welcome to Develop Team"; 
	}
}
