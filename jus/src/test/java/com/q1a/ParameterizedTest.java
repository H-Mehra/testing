package com.q1a;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runners.Parameterized.Parameters;


public class ParameterizedTest {

	private double expected;
	private double valueOne;
	private double valueTwo;
	
	@Parameters
	public static Collection<Integer[]> getTestParameters() {
		return Arrays.asList(new Integer[][]{
				{2,1,1},
				{3,2,1},
				{4,3,1}
				});
		
	}


	public ParameterizedTest(double expected, double valueOne, double valueTwo) {
		super();
		this.expected = expected;
		this.valueOne = valueOne;
		this.valueTwo = valueTwo;
	}
	
	@Test
	public void sum() {
		Calculator calc = new Calculator();
		assertEquals(expected,calc.add(valueOne,valueTwo),0);
	}
	

}
