package com.example.demo.configuration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/config")
public class ConfigController {
	
	@Value("${bar:#{null}}")
    private String bar;
	
	private final JavaInjectedService javaService;
	
	public ConfigController(JavaInjectedService javaService) {
		this.javaService = javaService;
	}
	
	@GetMapping("/envVar")
	public String getEnvVariable() {
		return "The environment variable bar was set as " + bar;
	}
	
	@GetMapping("/java")
	public String javaConfig() {
		return javaService.getMessage();
	}

}
