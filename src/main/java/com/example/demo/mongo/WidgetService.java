package com.example.demo.mongo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WidgetService {

	
	@Autowired
	private WidgetRepository repo;
	
	public Widget addWidget(int numparts) {
		Widget newWidget = new Widget();
		newWidget.setNumparts(numparts);
		return repo.save(newWidget);
	}
}
