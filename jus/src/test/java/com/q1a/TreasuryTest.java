package com.q1a;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TreasuryTest {
	private Treasury richMan;
	private Treasury poorMan;
	private static final long RICHMAN_NOOFGOLD = 1000;
	private static final long POORMAN_NOOFGOLD = 0;

	@Before
	public void initialize(){
		richMan = new Treasury(RICHMAN_NOOFGOLD);
		poorMan = new Treasury(POORMAN_NOOFGOLD);

	}
	@After
	public void tearDown(){
		richMan = null;
		poorMan = null;
	}
	
	@Test
	public void testGetGold() {
		assertEquals(richMan.getGold(),RICHMAN_NOOFGOLD);
		assertEquals(poorMan.getGold(),POORMAN_NOOFGOLD);
	}

	@Test
	public void testRemoveGold() {
		fail("Not yet implemented");
	}


}
