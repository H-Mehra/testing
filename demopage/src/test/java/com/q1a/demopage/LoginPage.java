package com.q1a.demopage;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

 

public class LoginPage extends Page{
	
	@Test
	public LoginHomePage LoginTest() throws IOException{
		
			System.out.println(propConfig.getProperty("baseURL"));
		
			driver=new FirefoxDriver();
			driver.get(propConfig.getProperty("baseURL"));
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			
			System.out.println(propOR.getProperty("login_link"));
			System.out.println(propOR.getProperty("input_userName"));
			
			driver.findElement(By.xpath(propOR.getProperty("login_link"))).click();
			driver.findElement(By.xpath(propOR.getProperty("input_userName"))).sendKeys(propConfig.getProperty("userName"));
			driver.findElement(By.xpath(propOR.getProperty("input_password"))).sendKeys(propConfig.getProperty("password"));
			driver.findElement(By.xpath(propOR.getProperty("login_button"))).click();
				return new LoginHomePage();
			
			
				
	}
	

}
