package com.q1a.test;

import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.q1a.pageobject.HomePage;

public class HomePageTest {
	 
	private static WebDriver driver;
	
	@BeforeClass
	public static void init() {
		driver = new FirefoxDriver();
	}

	@Test
	public void loadHomePageClickRegister() {
		HomePage home = new HomePage(driver);
	}

}
