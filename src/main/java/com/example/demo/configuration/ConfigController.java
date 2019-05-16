package com.example.demo.configuration;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/config")
public class ConfigController {
	
	private final JavaInjectedService javaService;
	
	public ConfigController(JavaInjectedService javaService) {
		this.javaService = javaService;
	}
	
	@RequestMapping("/java")
	public String javaConfig() {
		return javaService.getMessage();
	}

}
