package com.example.demo.persistance.mongodb;

import org.springframework.data.annotation.Id;

public class SocialMediaPost {
	
	@Id
	private int id;
	private String etsyId;
	
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEtsyId() {
		return etsyId;
	}
	public void setEtsyId(String etsyId) {
		this.etsyId = etsyId;
	}
	

}
