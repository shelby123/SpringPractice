package com.example.demo.dependencyInjection;

import org.springframework.stereotype.Service;

@Service
public class DependencyInjection_Service1  implements IDependencyInjection {

	@Override
	public String message() {
		// TODO Auto-generated method stub
		return "Hello from dependency Injection Service 1";
	}

}
