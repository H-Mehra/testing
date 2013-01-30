package com.q1a;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TreasuryTest {

	private Treasury empty;
	private Treasury full;
	
	@Before
	public void init()
	{
		empty = new Treasury(0);
		full = new Treasury(1000);
	}
	
	@Test
	public void testGetGold() {
		assertEquals(full.getGold(),1000);
		assertEquals(empty.getGold(),0);
	}

	
	@Test
	public void testAddGold() {
		fail("Not yet implemented");
	}

	@Test
	public void testRemoveGold() {
		fail("Not yet implemented");
	}


}
