package com.q1a.demopage;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;

public abstract class Page {

	protected static  WebDriver driver;
	protected static Properties propConfig;
	protected static Properties propOR;
	@BeforeClass
	public static void setUp() throws IOException{
		 propConfig = new Properties();
		 propOR =new Properties();
		
		System.out.println(System.getProperty("user.dir"));
		
		String configpath = System.getProperty("user.dir")+"\\CONFIG.properties";
		System.out.println(configpath);
		FileInputStream fis1=new FileInputStream(configpath);
		propConfig.load(fis1);
	
		String orpath = System.getProperty("user.dir")+"\\OR.properties";
		FileInputStream fis2=new FileInputStream(orpath);
		//fis2=new FileInputStream(orpath);
		propOR.load(fis2);
	}
}
