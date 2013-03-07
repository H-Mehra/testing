package com.q1a.pageobject;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class SignUpPageFactory extends Page {

	private WebDriver driver;
	@FindBy(how = How.ID, using = "FirstName")
	private WebElement firstName;

	@FindBy(how = How.ID, using = "LastName")
	private WebElement lastName;

	@FindBy(how = How.ID, using = "EmailAddress")
	private WebElement emailAddress;

	@FindBy(how = How.ID, using = "Password")
	private WebElement password;

	@FindBy(how = How.ID, using = "ConfirmPassword")
	private WebElement confirmPassword;

	@FindBy(how = How.ID, using = "ddlcountry1")
	private WebElement ddlcountry1;

	@FindBy(how = How.ID, using = "recaptcha_response_field")
	private WebElement recaptcha_response_field;

	@FindBy(how = How.ID, using = "hyplnk_cancel")
	private WebElement hyplnkCancel;

	@FindBy(how = How.ID, using = "reset_button")
	private WebElement reset;

	@FindBy(how = How.ID, using = "signup_button")
	private WebElement signup;

	public SignUpPageFactory(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, SignUpPageFactory.class);
	}

	@Test
	public void signupTest() throws Exception {

		driver.get("http://173.200.182.212:9090/test.q1a/User/SignUp");
		firstName.clear();
		firstName.sendKeys("First Name");
		lastName.clear();
		lastName.sendKeys("Last Name");
		emailAddress.clear();
		emailAddress.sendKeys("user@infoobjects.com");
		password.clear();
		password.sendKeys("1234");
		confirmPassword.clear();
		confirmPassword.sendKeys("1234");

		new Select(ddlcountry1).selectByVisibleText("Albania");
		recaptcha_response_field.clear();
		recaptcha_response_field.sendKeys("12234");

		hyplnkCancel.click();

	}

}
