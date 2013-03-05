package com.q1a.pageobject;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class UserHomePage extends Page {

	public UserHomePage(WebDriver driver) {
		this.driver = driver;
	}

	public void linksOnUserHomePage() {
		LoginPage test = new LoginPage(driver);
		// UserHomePage userHomePage=new UserHomePage(driver);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		test.testLogin();

		System.out.println(driver.findElement(
				By.xpath("//*[@id='hyplnk_testtitle0']")).getText());

		List<WebElement> allLinks = driver.findElements(By.tagName("a"));
		for (int i = 0; i < allLinks.size(); i++) {
			System.out.println(allLinks.get(i).getText());

		}

		driver.quit();

	}

}
