package com.example.demo.exceptionhandler;

public class ProfileNotFoundException extends RuntimeException{

	private static final long serialVersionUID = 1L;

	public ProfileNotFoundException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}
	

}
