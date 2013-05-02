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

public class HomePageImplicitWait {

	private static WebDriver driver;

	@BeforeClass
	public static void init() {
		driver = new FirefoxDriver();
		driver.get("http://www.q1a.com");
		// Below statement is for implicit wait for a weblink to load
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	

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

	@Test
	public void testHeading(){
		WebElement heading = driver.findElement(By.xpath("html/body/div[2]/div[3]/div[1]/div[1]"));
		assertEquals("Text is not displayed","Welcome to Q1A – technical skills testing system for IT and software engineering professionals", heading.getText());
	}
	
	@Test
	public void testLogin(){
		//WebElement loginDiv= driver.findElement(By.id("1_fblogin"))
		WebElement login = driver.findElement(By.xpath(".//*[@id='img_login']"));
		assertNotNull(login);
		assertEquals("http://www.q1a.com/q1a/Content/Images/login.png",login.getAttribute("src"));
		assertEquals("Login",login.getAttribute("title"));
		
			
	}
	@Test
	public void testVideo2(){
	
	}
	

	@AfterClass
	public static void cleanUp() {
		driver.close();
	}

}
