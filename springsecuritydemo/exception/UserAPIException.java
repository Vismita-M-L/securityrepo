package com.techlabs.springsecuritydemo.exception;

import org.springframework.http.HttpStatus;

public class UserAPIException extends RuntimeException{
	private String message;
	private HttpStatus status;
	
	public UserAPIException( HttpStatus status,String message) {
		super();
		this.message = message;
		this.status = status;
	}

	@Override
	public String toString() {
		return "UserAPIException [message=" + message + ", status=" + status + "]";
	}
	
	

}
