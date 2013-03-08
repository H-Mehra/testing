package com.q1a.pageobject;

import org.openqa.selenium.WebDriver;

public class HomePage extends Page {

	public HomePage(WebDriver driver) {
		this.driver = driver;

	}

	public SignUpPage clickSignUpPage() {

		return new SignUpPage(driver);
	}

	public LoginPage clickLoginButton() {

		return new LoginPage(driver);
	}

	public String getTitle() {

		return driver.getTitle();
	}

	public HiringManagerSignupPage clickHiringManagerSignup() {

		return new HiringManagerSignupPage(driver);
	}

}
