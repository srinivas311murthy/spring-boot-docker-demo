package com.cnu.test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest")
public class welcomeService {
	
	@GetMapping("/hi")
	public String sayHello() {
		return "Hello World";
	}
	
	@GetMapping("/{name}")
	public String sayHello(@PathVariable String name) {
		return "Welcome " + name;
	}

}
