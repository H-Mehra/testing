package com.q1a.pageobject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class LoginPage extends Page {
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	
	
	
	public UserHomePage testLogin(){		
		driver.get("http://173.200.182.212:9090/test.q1a/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id='img_login']")).click();
		driver.findElement(By.xpath("//*[@id='UserName']")).sendKeys("shruthi@infoobjects.com");
		driver.findElement(By.xpath("//*[@id='Password']")).sendKeys("pass@1234");
		driver.findElement(By.xpath("//*[@id='Login']")).click();
		
		return new UserHomePage(driver);
	}

}
