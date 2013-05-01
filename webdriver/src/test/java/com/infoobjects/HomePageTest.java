package com.infoobjects;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.List;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HomePageTest {

	private static WebDriver driver;

	@BeforeClass
	public static void init() {

		driver = new FirefoxDriver();
		driver.get("http://q1a.com");

	}

	@Test
	public void testTitle() {
		assertEquals("Title is not as expected",
				"Technical Assessment Platform", driver.getTitle());
	}

	@Test
	public void testUrl() {
		assertEquals("http://www.q1a.com/q1a", driver.getCurrentUrl());

	}

	@Test
	public void testlogo() {

		WebElement logo = driver.findElement(By.id("img_logo"));
		assertNotNull(logo);
		assertEquals("0", logo.getAttribute("border"));
		assertEquals("Technical Assessment Platform",
				logo.getAttribute("title"));

	}

	@Test
	public void testLoginDiv() {

		WebElement loginDiv = driver.findElement(By.id("1_fblogin"));

		List<WebElement> divs = loginDiv.findElements(By.tagName("div"));

	}

	@AfterClass
	public static void cleanUp() {
		driver.close();
	}

}
