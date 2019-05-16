package com.example.demo.configuration.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.demo.configuration.JavaInjectedService;

@Configuration
public class InjectedServiceJavaConfig {

	@Bean 
	public JavaInjectedService javaInjectedService() {
		return new JavaInjectedService("Hello from the java injection service config file");
	}
	
}
