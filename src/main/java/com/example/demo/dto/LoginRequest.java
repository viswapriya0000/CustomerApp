package com.example.demo.dto;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;


public class LoginRequest {
	
	@Email
	@NotBlank(message="username should not be blank")
	private String customerName;
	
	@NotBlank(message="password should not be blank")
	private String password;

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	

}
