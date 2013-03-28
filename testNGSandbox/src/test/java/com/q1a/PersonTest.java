package com.q1a;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class PersonTest {

	private static Person person;

	@BeforeClass
	public static void setUp() {
		person = new Person();
		person.setFirstName("John");
		person.setLastName("AppleSeed");
	}
	
	@BeforeGroups(groups="sanityTest")
	public void initSanity() {
		System.out.println("Initializing Sanity Test environment");
	}
	
	@BeforeGroups(groups="smokeTest")
	public void initSmoke() {
		System.out.println("Initializing Smoke Test environment");
	}
	
	@BeforeTest
	public void beforeT() {
	 System.out.println("Before Test called");
	}
	
	
	@BeforeMethod
	public void beforeM() {
	 System.out.println("Before Method called");
	}
	
	
	@Test(enabled=false)
	public void ignoreMe() {
		System.out.println("If you see this message I am not getting ignored");
	}
	
	@Test(expectedExceptions=ArithmeticException.class,groups="smokeTest")
	public void testDivideByZero() {
		int i = 0;
		int j = 1;
		int k =j/i;
	}

	@Test(groups = {"sanityTest"})
	public void testFirstName() {
		assertEquals(person.getFirstName(),"John");
	}
	
	@AfterClass
	public static void tearDown() {
		person = null;
	}
}
