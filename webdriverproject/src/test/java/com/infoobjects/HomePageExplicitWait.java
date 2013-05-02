package com.infoobjects;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePageExplicitWait {

	private static WebDriver driver;

	@BeforeClass
	public static void init() {
		driver = new FirefoxDriver();
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

		WebElement logo = (new WebDriverWait(driver, 10))
				.until(new ExpectedCondition<WebElement>() {
					public WebElement apply(WebDriver d) {
						return d.findElement(By.id("img_logo"));
					}
				});

		assertNotNull(logo);
		assertEquals("0", logo.getAttribute("border"));
		assertEquals("Technical Assessment Platform",
				logo.getAttribute("title"));
		assertEquals("http://www.q1a.com/q1a/Content/Images/logo.png",
				logo.getAttribute("src"));

	}

	@Test
	public void testHeading() {
		WebElement heading = driver.findElement(By
				.xpath("html/body/div[2]/div[3]/div[1]/div[1]"));
		assertEquals(
				"Text is not displayed",
				"Welcome to Q1A – technical skills testing system for IT and software engineering professionals",
				heading.getText());
	}

	@Test
	public void testLogin() {
		// WebElement loginDiv= driver.findElement(By.id("1_fblogin"))
		WebElement login = driver
				.findElement(By.xpath(".//*[@id='img_login']"));
		assertNotNull(login);
		assertEquals("http://www.q1a.com/q1a/Content/Images/login.png",
				login.getAttribute("src"));
		assertEquals("Login", login.getAttribute("title"));

	}

	@AfterClass
	public static void cleanUp() {
		driver.close();
	}

}
