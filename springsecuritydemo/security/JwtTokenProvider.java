package com.techlabs.springsecuritydemo.security;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class JwtTokenProvider{
	@Value("${app.jwt-secret}")
	private String jwtsecret;
	@Value("${app-jwt-expiration-milliseconds}")
	private long jwtExpirationDate;
	
	

}
