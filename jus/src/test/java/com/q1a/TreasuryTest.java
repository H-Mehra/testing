package com.q1a;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TreasuryTest {
	private Treasury richMan;
	private Treasury poorMan;

	@Before
	public void initialize(){
		richMan = new Treasury(1000);
		poorMan = new Treasury(0);

	}
	@After
	public void tearDown(){
		richMan = null;
		poorMan = null;
	}
	
	@Test
	public void testGetGold() {
		assertEquals(richMan.getGold(),1000);
		assertEquals(poorMan.getGold(),0);
	}

	@Test
	public void testRemoveGold() {
		fail("Not yet implemented");
	}


}
