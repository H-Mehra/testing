package com.q1a.auto;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.safari.SafariDriver;

public class SafariHomeTest extends HomeBase {

	@BeforeClass
	public static void setUp() {
		driver = new SafariDriver();
		driver.get("http://173.200.182.212:9090/test.q1a/");
	}

	@AfterClass
	public static void tearDown() {
		driver.quit();
		driver = null;

	}

}
