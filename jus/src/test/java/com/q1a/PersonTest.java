package com.q1a;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.categories.Categories.ExcludeCategory;

public class PersonTest {
	
	Person rishi;
	

	@Before
	public void init() {
		rishi = new Person("Rishi","Yadav");
	}

	@After
	public void clean() {
		rishi = null;
	}

	@Test
	public void testFirstName() {
		assertEquals("Rishi",rishi.getFirstName());
	}
	
	@Test
	public void testLastName() {
		assertEquals("Yadav",rishi.getLastName());
	}
	
	@Test(expected=CloneNotSupportedException.class)
	public void testCloneNotSupported() throws CloneNotSupportedException {
		Person rishiClone = rishi.clone();
	}

}
