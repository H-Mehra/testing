package com.q1a.auto;

import java.util.concurrent.TimeUnit;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeHomeTest extends HomeBase {

	@BeforeClass
	public static void setUp() throws Exception {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Shruthi\\InfoObject\\chrome\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://www.q1a.com/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
	}

	@AfterClass
	public static void tearDown() throws Exception {
		driver.quit();
		driver = null;
	}

	

}
