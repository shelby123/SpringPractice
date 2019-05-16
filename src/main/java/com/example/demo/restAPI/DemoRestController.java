package com.example.demo.restAPI;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/rest")
public class DemoRestController {
	
	@GetMapping(value="/pathParam/{value}")
	public String pathParameter(@PathVariable("value") int val) {
		return "Path parameter value : " + val;
	}
}
