package com.q1a.auto;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeHomeTest extends HomeBase {

	@BeforeClass
	public static void setUp() throws Exception {
		
		String os = System.getProperty("os.name");
		if (os.split("Mac").length > 0)
			System.setProperty("webdriver.chrome.driver","/Users/rishi/chromedriver");
		driver = new ChromeDriver();
		driver.get("http://www.a1a.com/");
		
	}

	@AfterClass
	public static void tearDown() throws Exception {
		driver.quit();
		driver = null;
	}

	

}
