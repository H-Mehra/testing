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
		driver.get("http://173.200.182.212:9090/test.q1a/");
	}

	@AfterClass
	public static void tearDown() throws Exception {
		driver.quit();
		driver = null;
	}

	

}
