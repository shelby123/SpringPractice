package com.example.demo.configuration;

public class JavaInjectedService {
	
	private String message;
	
	public JavaInjectedService(String message) {
		this.message = message;
	}
	
	public String getMessage() {
		return message;
	}

}
