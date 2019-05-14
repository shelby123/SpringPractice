package com.example.demo.dependencyInjection.profiles;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("default")
public class ProfileInjection_default implements IProfileInjection {

	@Override
	public String message() {
		// TODO Auto-generated method stub
		return "Hello from the default profile injection service. "
				+ "\n I get set whenever no active profile is specified in application.properties";
	}

}
