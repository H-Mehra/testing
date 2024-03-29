package com.q1a.autopage;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeHomeTest extends HomeTestBase{

    private static WebDriver driver;
    private static String OS = System.getProperty("os.name").toLowerCase();

    @BeforeClass
	public static void setUp() {
		WebDriver driver = new ChromeDriver();
		driver.get("http://173.200.182.212:9090/test.q1a/");
		page = new HomePage(driver);
		
		System.out.println(OS);
        //Modify path where  chromedriver reside
		if (isWindows()) {
			System.out.println("This is Windows");
			System.setProperty("webdriver.chrome.driver",
					"C:/Chromedriver/chromedriver");
		} else if (isMac()) {
			System.out.println("This is Mac");
			System.setProperty("webdriver.chrome.driver",
					"/volumes/DATA/InfoObject/chromedriver");

		} else if (isUnix()) {
			System.out.println("This is Unix or Linux");
		} else if (isSolaris()) {
			System.out.println("This is Solaris");
		} else {
			System.out.println("Your OS is not support!!");
		}

		driver = new ChromeDriver();
		driver.get("http://www.q1a.com/");
		
	}

	@AfterClass
	public static void tearDown() {
		driver.quit();
		driver = null;

	}
	
	
	public static boolean isWindows() {
		return (OS.indexOf("win") >= 0);

	}

	public static boolean isMac() {
		return (OS.indexOf("mac") >= 0);
	}

	public static boolean isUnix() {
		return (OS.indexOf("nix") >= 0 || OS.indexOf("nux") >= 0 || OS
				.indexOf("aix") > 0);
	}

	public static boolean isSolaris() {
		return (OS.indexOf("sunos") >= 0);
	}

	

}
