package com.example.demo.mongo;

import java.util.List;

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
	
	public List<Widget> getWidgetsByNumParts(int numparts) {
		return repo.findByNumparts(numparts);
	}

	public Widget addGizmoToWidget(String id, Gizmo gizmo) {
		// TODO Auto-generated method stub
		Widget widget = repo.findOneById(id);
		widget.addGizmo(gizmo);
		repo.save(widget);
		return widget;
	}
	
	public Widget findWidgetById(String id) {
		return repo.findOneById(id);
	}
	
	
	
	
	
	
	
	
	
	
}
