package com.learning.abhi.devops.tests;

import org.junit.Test;

import com.learning.abhi.devops.Login;

public class LoginTest {
	
	@Test
	public void testInvalidLogin(){
		Login log = new Login();
		boolean flag = log.login("abhi", "srimaan");
		if(flag==true){
			System.out.println("Valid Login");
		}
		else{
			System.out.println("Invalid login");
		}
	}
	
	
	@Test
	public void testValidLogin(){
		Login log = new Login();
		boolean flag = log.login("abhi", "abhi");
		if(flag==true){
			System.out.println("Valid Login");
		}
		else{
			System.out.println("Invalid login");
		}
	}


}
