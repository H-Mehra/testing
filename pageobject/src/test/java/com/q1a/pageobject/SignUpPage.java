package com.q1a.pageobject;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class SignUpPage extends Page {

	public SignUpPage(WebDriver driver) {
		this.driver = driver;
	}

	@Test
	public void signupTest() throws Exception {

		driver.get("http://173.200.182.212:9090/test.q1a/User/SignUp");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.findElement(By.id("FirstName")).clear();
		driver.findElement(By.id("FirstName")).sendKeys("Brian ");

		driver.findElement(By.id("LastName")).clear();
		driver.findElement(By.id("LastName")).sendKeys("Heng");

		driver.findElement(By.id("EmailAddress")).clear();
		driver.findElement(By.id("EmailAddress")).sendKeys(
				"vannarin@infoobjects");

		driver.findElement(By.id("Password")).clear();
		driver.findElement(By.id("Password")).sendKeys("1234");

		driver.findElement(By.id("ConfirmPassword")).clear();
		driver.findElement(By.id("ConfirmPassword")).sendKeys("1234");

		new Select(driver.findElement(By.id("ddlcountry1")))
				.selectByVisibleText("Albania");

		driver.findElement(By.id("hyplnk_cancel")).click();

		//return new SignUpPage(driver);
	}

}
