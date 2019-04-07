package com.testdb.testdb;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping
@RestController
public class DbController {
	@GetMapping("/{name}")
	public String returnString(@PathVariable("name") String name) {
		return "Hello " + name;
	}
}
