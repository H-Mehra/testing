package com.q1a.pageobject;

	import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

	public class SignUpPageTest {
		@Test 
		public void SignUpTest(){
			WebDriver driver=new FirefoxDriver();
			SignUpPage signUpPage = new SignUpPage(driver);
			try {
				signUpPage.signupTest();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			driver.quit();
					
		}

	}
