package com.q1a.autopage;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class HtmlUnitHomeTest extends HomeTestBase{

	private static WebDriver driver;
	@BeforeClass
	public static void setUp() {
		WebDriver driver = new HtmlUnitDriver();
		driver.get("http://www.q1a.com/");
		page = new HomePage(driver);
	}

	@AfterClass
	public static void tearDown() {
		driver.quit();
		driver = null;

	}

}



