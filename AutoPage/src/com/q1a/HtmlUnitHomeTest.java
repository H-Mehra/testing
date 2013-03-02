package com.q1a;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class HtmlUnitHomeTest extends HomeTestBase{

	@BeforeClass
	public static void setUp() throws Exception {
		driver = new HtmlUnitDriver();
		driver.get("http://www.q1a.com/");
	}

	@AfterClass
	public static void tearDown() throws Exception {
		driver.quit();
		driver = null;
	}

	

}
