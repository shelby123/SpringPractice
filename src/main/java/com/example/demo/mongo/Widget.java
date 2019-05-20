package com.example.demo.mongo;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="widgetCollection")
public class Widget {

	
	@Id
	private String id;
	
	private List<Gizmo> gizmos;
	
	private int numparts;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getNumparts() {
		return numparts;
	}

	public void setNumparts(int numparts) {
		this.numparts = numparts;
	}
	
	public boolean addGizmo(Gizmo gizmo) {
		return gizmos.add(gizmo);
	}

	public List<Gizmo> getGizmos() {
		return gizmos;
	}

	public void setGizmos(List<Gizmo> gizmos) {
		this.gizmos = gizmos;
	}
	
}
