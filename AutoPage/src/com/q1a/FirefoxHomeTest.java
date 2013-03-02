package com.q1a;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
 
public class FirefoxHomeTest extends HomeTestBase {

	private static WebDriver driver;
	@BeforeClass
	public static void setUp() {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.q1a.com/");
		page = new HomePage(driver);
	}

	@AfterClass
	public static void tearDown() {
		driver.quit();
		driver = null;

	}

}
