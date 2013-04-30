package com.infoobjects;

import static org.junit.Assert.*;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HomePageTest {

	@Test
	public void test() {
		// fail("Not yet implemented");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://q1a.com");
		assertEquals("Title is not as expected",
				"Technical Assessment Platform", driver.getTitle());
		assertEquals("http://www.q1a.com/q1a", driver.getCurrentUrl());
		driver.close();

	}

}
