package com.example.demo.mongo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/mongo")
public class MongoController {
	
	@Autowired
	private WidgetService widgetService;
	
	@GetMapping("/{numParts}")
	public Widget getWidget(@PathVariable("numParts") int numParts) {
		return widgetService.addWidget(numParts);
		
	}

}
