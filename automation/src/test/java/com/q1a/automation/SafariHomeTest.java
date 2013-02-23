package com.q1a.automation;

import static org.junit.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.safari.SafariDriver;

public class SafariHomeTest extends HomePageBaseTest {

	public SafariHomeTest(){
		
		setUp();
		testTitle();
		testURL();
		tearDown();
		
	}
	
	
	@BeforeClass
	public static void setUp() {
		driver = new SafariDriver();
	}

	@Test
	public void testTitle() {
		// driver.get("http://"+ baseURL);
		driver.get("http://www.q1a.com");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		assertEquals("Technical Assessment Platform", driver.getTitle());
		// assertEquals(title, driver.getTitle());

	}
	
	@Test
	public void testURL() {
		String baseurl;
		baseurl = "http://www.q1a.com/q1a";
		assertEquals(baseurl, driver.getCurrentUrl());

	}
   
	
	@AfterClass
	public static void tearDown() {
	
		driver.quit();

	}

}
