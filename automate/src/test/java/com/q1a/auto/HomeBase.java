package com.q1a.auto;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public abstract class HomeBase {
	
	protected static WebDriver driver;
	
	@Test public void testTitle() {
		String title = driver.getTitle();
		assertEquals("Title is not as expected","Technical Assessment Platform",title);
	}
	
	@Test public void testLogo() {
		WebElement logo = driver.findElement(By.id("img_logo"));
		String tagName = logo.getTagName();
		assertEquals("This Element is not an image","img".toUpperCase(),tagName.toUpperCase());
		String border = logo.getAttribute("border");
		assertEquals("Border should be invisible as per specs","0",border);
		String title =logo.getAttribute("title");		
		assertEquals("The title is not as expected","Technical Assessment Platform",title);
		
		
		
	}

}
