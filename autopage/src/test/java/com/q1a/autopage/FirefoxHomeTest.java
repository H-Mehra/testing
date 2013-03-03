package com.q1a.autopage;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
 
public class FirefoxHomeTest extends HomeTestBase {

	private static WebDriver driver;
	@BeforeClass
	public static void setUp() {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://173.200.182.212:9090/test.q1a/");
		page = new HomePage(driver);
	}

	@AfterClass
	public static void tearDown() {
		driver.quit();
		driver = null;

	}

}
