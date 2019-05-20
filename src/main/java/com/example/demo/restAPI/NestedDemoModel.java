package com.example.demo.restAPI;

import java.util.List;

public class NestedDemoModel {
	
	public String name;
	
	List<DemoModel> demoModels;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<DemoModel> getDemoModels() {
		return demoModels;
	}

	public void setDemoModels(List<DemoModel> demoModels) {
		this.demoModels = demoModels;
	}

	@Override
	public String toString() {
		return "NestedDemoModel [name=" + name + ", demoModels=" + demoModels + "]";
	}
	
	

}
