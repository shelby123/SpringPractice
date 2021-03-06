package com.example.demo.mongo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
	
	@GetMapping("/find/{numParts}")
	public List<Widget> findWidgetByNumParts(@PathVariable("numParts") int numparts) {
		return widgetService.getWidgetsByNumParts(numparts);
	}
	
	@GetMapping("/widget/{id}")
	public Widget findWidgetById(@PathVariable("id") String id) {
		return widgetService.findWidgetById(id);
	}
	
	@PostMapping("/widget/{id}/add")
	public Widget addGizmoToWidget(@PathVariable("id") String id, @RequestBody Gizmo gizmo) {
		return widgetService.addGizmoToWidget(id, gizmo);
	}

}
