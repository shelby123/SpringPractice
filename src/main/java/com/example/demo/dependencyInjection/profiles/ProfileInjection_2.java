package com.example.demo.dependencyInjection.profiles;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("profile2")
public class ProfileInjection_2 implements IProfileInjection {

	@Override
	public String message() {
		// TODO Auto-generated method stub
		return "Hello from profile 2";
	}
	
}
