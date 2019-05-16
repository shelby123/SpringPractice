package com.example.demo.errorHandling;

public class ContentNotFound extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2702240325846080148L;

	public ContentNotFound(String message) {
		super(message);
	}
}
