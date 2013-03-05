package com.q1a.pageobject;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginTest {
	@Test 
	public UserHomePage testLogin(){
		WebDriver driver=new FirefoxDriver();
		LoginPage loginPage = new LoginPage(driver);
		UserHomePage userHomePage=new UserHomePage(driver);
		userHomePage=loginPage.testLogin();
		return userHomePage;
		
				
				
	}

}
