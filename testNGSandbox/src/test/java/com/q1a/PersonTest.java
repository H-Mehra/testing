package com.q1a;

import org.testng.Assert;
import org.testng.annotations.Test;


public class PersonTest {

	
	@Test
	public void testFirstName() {
		String firstName= "Brian";
	    Assert.assertEquals("Brian", firstName);
	}
}
