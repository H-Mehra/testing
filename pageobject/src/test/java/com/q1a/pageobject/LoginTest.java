package com.q1a.pageobject;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginTest {
	@Test 
	public void testLogin(){
		WebDriver driver=new FirefoxDriver();
		LoginPage loginPage = new LoginPage(driver);
		//UserHomePage userHomePage=new UserHomePage(driver);
		UserHomePage userHomePage=loginPage.testLogin();
			driver.quit();
				
	}

}
