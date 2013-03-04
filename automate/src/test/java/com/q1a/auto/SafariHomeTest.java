package com.q1a.auto;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.safari.SafariDriver;

public class SafariHomeTest extends HomeBase {

	@BeforeClass
	public static void setUp() {
		driver = new SafariDriver();
		driver.get("http://" + BASE_URL);
		System.out.println("Current URL = " + BASE_URL + ". To Modify change BASE_URL in HomeBase.java");  
	}

	@AfterClass
	public static void tearDown() {
		driver.quit();
		driver = null;

	}

}
