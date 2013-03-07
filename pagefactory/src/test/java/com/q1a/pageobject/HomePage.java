package com.q1a.pageobject;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.LoadableComponent;
import static org.junit.Assert.*;

public class HomePage extends LoadableComponent<HomePage> {

	WebDriver driver;
	@FindBy(how = How.ID, using = "img_logo")
	WebElement logo;

	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@Override
	protected void isLoaded() {
      assertEquals(driver.getTitle(),"Technical Assessment Platform");
	}

	@Override
	protected void load() {
		driver.get("http://www.q1a.com/");

	}

}
