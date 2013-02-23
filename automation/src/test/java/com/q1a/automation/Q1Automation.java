package com.q1a.automation;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;

public class Q1Automation {
	private static WebDriver driver;
	
	
	@Test
	public void testHome(){
		WebDriver driver = new SafariDriver();
		driver.get("http://q1a.com");
		assertEquals("Technical Assessment Platform", driver.getTitle());
		driver.close();
		driver.quit();
		
	}

	
}
