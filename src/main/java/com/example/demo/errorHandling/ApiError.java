package com.example.demo.errorHandling;

public class ApiError {
	
	private String message;
	
	public ApiError(String message) {
		this.message = message;
	}
	
	

	public String getMessage() {
		return message;
	}



	public void setMessage(String message) {
		this.message = message;
	}



	@Override
	public String toString() {
		return "ApiError [message=" + message + "]";
	}
	
	
}
