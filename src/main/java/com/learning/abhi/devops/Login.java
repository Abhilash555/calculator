package com.learning.abhi.devops;

public class Login {
	
	public boolean login(String username, String password) {
		
		if(username.equals(password)){
			return true;
			//DB Code 
		}
		else{
			return false;
		}
	}

}
