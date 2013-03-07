package com.q1a.pageobject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;


public class LoginPage extends Page {
	
	
	@FindBy(how=How.ID,using="img_login")
	WebElement login;
	
	@FindBy(how=How.ID,using="UserName")
	WebElement userName;
	
	@FindBy(how=How.ID,using="Password")
	WebElement password;
	
	@FindBy(how=How.ID,using="Login")
	WebElement loginButton;
	
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	
	public UserHomePage testLogin(){		
		driver.get("http://173.200.182.212:9090/test.q1a/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		login.click();
		userName.sendKeys("shruthi@infoobjects.com");
		password.sendKeys("pass@1234");
		loginButton.click();
		
		return new UserHomePage(driver);
	}

}
