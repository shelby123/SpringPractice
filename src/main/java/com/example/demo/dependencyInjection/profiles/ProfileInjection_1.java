package com.example.demo.dependencyInjection.profiles;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("profile1")
public class ProfileInjection_1 implements IProfileInjection {

	@Override
	public String message() {
		// TODO Auto-generated method stub
		return "Hello from profile 1";
	}

}
