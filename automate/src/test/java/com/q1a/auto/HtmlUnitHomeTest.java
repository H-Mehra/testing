package com.q1a.auto;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class HtmlUnitHomeTest extends HomeBase{

	@BeforeClass
	public static void setUp() throws Exception {
		driver = new HtmlUnitDriver();
		driver.get("http://" + BASE_URL);
		System.out.println("Current URL = " + BASE_URL);  
	}

	@AfterClass
	public static void tearDown() throws Exception {
		driver.quit();
		driver = null;
	}

	

}
