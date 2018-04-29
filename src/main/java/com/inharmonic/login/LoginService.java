package com.inharmonic.login;

import org.springframework.stereotype.Service;

@Service
public class LoginService {
	
	public boolean isUserValid(String user, String password) {
		if (user.equals("Andy") && password.equals("password")) return true;
		else return false;
	}
}
