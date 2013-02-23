package com.q1a.automation;


import org.openqa.selenium.WebDriver;



public class HomePageBaseTest {
	protected static String baseUrl;
	protected static String title;
	
	protected static WebDriver driver;
	
	public static String getBaseUrl() {
		return baseUrl;
	}
	
	
	
	public static void setBaseUrl(String baseUrl) {
		HomePageBaseTest.baseUrl = baseUrl;
	}
	public static String getTitle() {
		return title;
	}
	public static void setTitle(String title) {
		HomePageBaseTest.title = title;
	}
	
	
	
	
}
