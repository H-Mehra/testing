package tigger.selTesting;

import static org.junit.Assert.*;

import java.io.File;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.*;
import org.openqa.selenium.chrome.*;

import org.junit.Test;

public class Q1aHomePageTest {

	@Test
	public void testHomeFireFox() {
		File pathToBinary = new File("C:\\Program Files (x86)\\Mozilla Firefox\\firefox.exe");
		FirefoxBinary ffBinary = new FirefoxBinary(pathToBinary);
		FirefoxProfile firefoxProfile = new FirefoxProfile();
		FirefoxDriver driver = new FirefoxDriver(ffBinary,firefoxProfile);
		/*
		FirefoxProfile firefoxProfile = new FirefoxProfile();
		
		FirefoxBinary binary = new FirefoxBinary("C:\\Program Files (x86)\\Mozilla Firefox\\firefox.exe");
		WebDriver driver = new FirefoxDriver(binary);
		//WebDriver driver = new FirefoxDriver("C:\\Program Files (x86)\\Mozilla Firefox\\firefox.exe");
		*/
		driver.get("http://www.q1a.com");
		assertEquals("Technical Assessment Platform", driver.getTitle());
	}
	@Test
	public void testHomeChrome() {
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.q1a.com");
		assertEquals("Technical Assessment Platform", driver.getTitle());
	}

}
