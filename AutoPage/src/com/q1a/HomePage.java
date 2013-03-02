package com.q1a;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage extends Page {
	
	
	public HomePage(WebDriver driver) {
		
		this.driver = driver;
		
	}
	
	
   public WebElement getLogo() {
	  return  driver.findElement(By.id("img_logo"));
	   
   }


public String getTitle() {
	return driver.getTitle();
}

}
