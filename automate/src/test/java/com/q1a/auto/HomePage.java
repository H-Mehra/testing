package com.q1a.auto;

import com.q1a.auto.HomeBase;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.List;
import java.util.NoSuchElementException;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HomePage extends HomeBase{
	
	@Test
	public void testTitle() {
		String title = driver.getTitle();
		assertEquals("Title is not as expected",
				"Technical Assessment Platform", title);
	}

	
	
	

}
