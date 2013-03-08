package com.q1a.pageobject;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;




public class HiringManagerSignupPage extends Page {

	public HiringManagerSignupPage(WebDriver driver) {
		this.driver = driver;
	}
	 
	
	@Test
	public void clickHiringManagerSignup() throws Exception {
     
		  
		    driver.get("http://173.200.182.212:9090//test.q1a/");
		    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		    
		    driver.findElement(By.id("img_hirimgmanager")).click();
		    
		    driver.findElement(By.id("FirstName")).clear();
		    driver.findElement(By.id("FirstName")).sendKeys("Lissa");
		    
		    driver.findElement(By.id("LastName")).clear();
		    driver.findElement(By.id("LastName")).sendKeys("Richard");
		    
		    driver.findElement(By.id("EmailAddress")).clear();
		    driver.findElement(By.id("EmailAddress")).sendKeys("lissa_richard@infoobject.com");
		    
		    driver.findElement(By.id("ConfirmEmailAddress")).clear();
		    driver.findElement(By.id("ConfirmEmailAddress")).sendKeys("lissa_richard@infoobject.com");
		    
		    driver.findElement(By.id("Password")).clear();
		    driver.findElement(By.id("Password")).sendKeys("1234");
		    
		    driver.findElement(By.id("ConfirmPassword")).clear();
		    driver.findElement(By.id("ConfirmPassword")).sendKeys("1234");
		    
		    driver.findElement(By.id("PhoneNumber")).clear();
		    driver.findElement(By.id("PhoneNumber")).sendKeys("650 865 3323");
		    
		    driver.findElement(By.id("AlternatePhoneNumber")).clear();
		    driver.findElement(By.id("AlternatePhoneNumber")).sendKeys("650 863 3323");
		    
		    new Select(driver.findElement(By.id("ddlcountry1"))).selectByVisibleText("USA");
		    
		    
		    driver.findElement(By.id("recaptcha_response_field")).clear();
		    driver.findElement(By.id("recaptcha_response_field")).sendKeys("test 123");
		    
		    driver.findElement(By.cssSelector("div.cancel-button")).click();
		   
		    
		  }
	
	}

