package com.kremlevmax.myfirstspringwebapplication.controllers.login;

import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {
	public boolean verifyCredentials(String username, String password) {
		boolean isNameRight = username.equalsIgnoreCase("Max");
		boolean isPasswordRight = password.equalsIgnoreCase("Kremlev");
		return isNameRight && isPasswordRight;
	}

}
