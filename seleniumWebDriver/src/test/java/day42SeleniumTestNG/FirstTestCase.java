package day42SeleniumTestNG;

import org.testng.annotations.Test;

/*
1) Open app
2) Login
3) Logout
*/

public class FirstTestCase {
	
	@Test
	void openapp() {
		System.out.println("Opening application....");
		
	}
	
	void login() {
		System.out.println("Login to application....");
		
	}
	
	void logout() {
		System.out.println("Logout from application....");
		
	}
	

}
