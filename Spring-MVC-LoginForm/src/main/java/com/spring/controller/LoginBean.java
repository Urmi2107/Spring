package com.spring.controller;

import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;


public class LoginBean {

	@NotEmpty(message="User name cannot be empty")
	@Pattern(regexp="[a-zA-Z]{3,20}",message="User name pattern wrong")
	@Size(min=3,max=20,message = "Your user name must be between 3 and 20 characters")
	private String userName;
	@NotEmpty(message="Password cannot be empty")
    @Size(min = 6, max = 15, message = "Your password must be between 6 and 15 characters")
	@Pattern(regexp="((?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%]).{6,20})",message="Password format wrong")
	private String password;

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

}
