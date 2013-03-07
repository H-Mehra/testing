package com.q1a.pageobject;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class UserHomePageTest {
	
	@Test
	public void testAllLinks(){
		WebDriver driver=new FirefoxDriver();
		UserHomePage userHomePage=new UserHomePage(driver);
		userHomePage.linksOnUserHomePage();
		userHomePage.q1aTestTable();
		driver.quit();
	}
	

}
