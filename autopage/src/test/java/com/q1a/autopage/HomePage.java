package com.q1a.autopage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage extends Page {

	public HomePage(WebDriver driver) {

		this.driver = driver;

	}

	public WebElement getLogo() {
		return driver.findElement(By.id("img_logo"));

	}

	public String getTitle() {
		return driver.getTitle();
	}

	public WebElement getTextWelcome() {

		WebElement element = driver.findElement(By
				.xpath("html/body/div[2]/div[3]/div[1]/div[1]"));

		return element;

	}

	public WebElement gettestHowItsWork() {

		WebElement element = driver.findElement(By.id("imgvideo"));

		return element;

	}

	public List<WebElement> getFooter() {
		List<WebElement> elements = driver.findElements(By.className("footer")
				.id("id"));

		return elements;

	}

	public WebElement getScheduleDemoClosed() {
		WebElement element = driver.findElement(By
				.className("requestwidthright"));

		return element;

	}

	public WebElement getFeedBackFooterPageLink() {
		WebElement element = driver.findElement(By.id("FullName"));

		return element;

	}

	public WebElement getReportABugFooterPageLink() {
		WebElement element = driver.findElement(By.id("Title"));
				
		return element;

	}
	
	
	
	
	
}
