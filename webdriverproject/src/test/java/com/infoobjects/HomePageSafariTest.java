package com.infoobjects;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;


public class HomePageSafariTest {

	private static WebDriver driver;

	@BeforeClass
	public static void init() {
		driver = new SafariDriver();
		driver.get("http://www.q1a.com");

	}

	@Test
	public void testTitle() {
		assertEquals("TITLE IS NOT AS EXPECTED",
				"Technical Assessment Platform", driver.getTitle());
	}

	@Test
	public void testUrl() {
		assertEquals("http://www.q1a.com/q1a", driver.getCurrentUrl());
	}

	@Test
	public void testLogo() {
		WebElement logo = driver.findElement(By.id("img_logo"));
		assertNotNull(logo);
		assertEquals("0", logo.getAttribute("border"));
		assertEquals("Technical Assessment Platform",
				logo.getAttribute("title"));
		assertEquals("http://www.q1a.com/q1a/Content/Images/logo.png",
				logo.getAttribute("src"));

	}

public void testHeading(){
	assertEquals("Title is not displayed","Welcome to Q1A – technical skills testing system for IT and software engineering professionals", driver.getTitle());
}

	@AfterClass
	public static void cleanUp() {
		driver.close();
	}

}
