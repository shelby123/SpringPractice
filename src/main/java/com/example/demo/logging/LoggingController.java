package com.example.demo.logging;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/log")
public class LoggingController {
	
	Logger logger = LoggerFactory.getLogger(LoggingController.class);

	
	@GetMapping(value="/basic")
	public String log() {
		logger.info("This is an info message");
		return "Logged an info message";
	}
}
