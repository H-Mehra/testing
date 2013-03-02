package com.q1a;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ FirefoxHomeTest.class,HtmlUnitHomeTest.class,SafariHomeTest.class, 
	            ChromeHomeTest.class })
public class HomeTestSuite {

}
