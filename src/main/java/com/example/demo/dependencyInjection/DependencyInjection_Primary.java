package com.example.demo.dependencyInjection;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
public class DependencyInjection_Primary implements IDependencyInjection{

	@Override
	public String message() {
		// TODO Auto-generated method stub
		return "Hello from the primary Dependency Injection service" ;
	}

}
