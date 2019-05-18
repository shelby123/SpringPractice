package com.example.demo.mongo;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Widget {

	
	@Id
	private String id;
	
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
	
}
