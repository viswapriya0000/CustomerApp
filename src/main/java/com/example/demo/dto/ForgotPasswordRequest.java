package com.example.demo.dto;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;


public class ForgotPasswordRequest {
	
	@Email
	@NotBlank(message="username should not be blank")
	private String userName;
	
	@NotBlank(message="password should not be blank")
	private String password;
	
	@NotBlank(message="confirm password should not be blank")
	private String confirmPassword;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getConfirmPassword() {
		return confirmPassword;
	}

	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}
	
	


}
