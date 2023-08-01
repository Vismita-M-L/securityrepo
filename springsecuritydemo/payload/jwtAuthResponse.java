package com.techlabs.springsecuritydemo.payload;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@RequiredArgsConstructor
@AllArgsConstructor
public class jwtAuthResponse {
	private String accessToken;
	private String tokenType="Bearer";

}
