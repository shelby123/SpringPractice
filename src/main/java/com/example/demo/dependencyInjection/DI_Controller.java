package com.example.demo.dependencyInjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dependencyInjection.profiles.IProfileInjection;



@RestController()
@RequestMapping("/dependencyInjector")
public class DI_Controller {
	
	@Autowired
	@Qualifier("dependencyInjection_Service1")
	IDependencyInjection injectedService1;
	
	@Autowired
	@Qualifier("dependencyInjection_Service2")
	IDependencyInjection injectedService2;
	
	
	@Autowired
	IDependencyInjection injectedServicePrimary;
	
	
	@Autowired
	IProfileInjection profileService;
	
	public DI_Controller() {
		
	}
	
	@RequestMapping(value="/profile")
	public String testProfileInjection() {
		return profileService.message();
	}
	

	@RequestMapping(value="/injection")
	public String testInjection() {
		return injectedServicePrimary.message();
	}
	
	
}












