package com.q1a.auto;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxHomeTest extends HomeBase {

	@BeforeClass
	public static void setUp() {
		driver = new FirefoxDriver();
		driver.get("http://" + BASE_URL);
		System.out.println("Current URL = " + BASE_URL);  
	}

	@AfterClass
	public static void tearDown() {
		driver.quit();
		driver = null;

	}

}
