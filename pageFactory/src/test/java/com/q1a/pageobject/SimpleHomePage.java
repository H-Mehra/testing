package com.q1a.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class SimpleHomePage {
	
	private WebDriver driver;
	@FindBy(how = How.ID, using ="img_logo")
	private WebElement logo;
	@FindBy(how = How.ID, using ="imgvideo")
	private WebElement imgVideo;
	
	
	public SimpleHomePage() {
		this.driver = driver;
		PageFactory.initElements(driver, SimpleHomePage.class);
	}

}
