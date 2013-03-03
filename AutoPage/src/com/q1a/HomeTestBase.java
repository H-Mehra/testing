package com.q1a;

import static org.junit.Assert.assertEquals;

import java.util.List;
import java.util.NoSuchElementException;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public abstract class HomeTestBase {

	protected static HomePage page;

	@Test
	public void testTitle() {
		String title = page.getTitle();
		assertEquals("Title is not as expected",
				"Technical Assessment Platform", title);
	}

	@Test
	public void testLogo() {
		WebElement logo = page.getLogo();
		String tagName = logo.getTagName();
		assertEquals("This Element is not an image", "img".toUpperCase(),
				tagName.toUpperCase());
		String border = logo.getAttribute("border");
		assertEquals("Border should be invisible as per specs", "0", border);
		String title = logo.getAttribute("title");
		assertEquals("The title is not as expected",
				"Technical Assessment Platform", title);
		String src = logo.getAttribute("src");
		assertEquals("The q1a Logo Image source is wrong.",
				"http://www.q1a.com/q1a/Content/Images/logo.png", src);

	}

	@Test
	public void testWelcome() {
		WebElement element = page.getTextWelcome();
		String welcomeText = element.getText();

		assertEquals(
				"It's not a welcome Text",
				"Welcome to Q1A – technical skills testing system for IT and software engineering professionals",
				welcomeText);

	}

	
	
	@Test
	public void testHowItsWork() {
		WebElement element = page.getTextWelcome();
		String tagName = element.getText();

		assertEquals("This element is not an image", "img", tagName);
		String alt = element.getAttribute("alt");
		assertEquals("Alt should be How it works?", "How it works ?", alt);
		String title = element.getAttribute("title");
		assertEquals("Title should be How it works?", "How it works ?", title);
		String style = element.getAttribute("style");
		assertEquals("Style should be pointer", "cursor: pointer;", style);
		element.click();
	}

	@Test
	public void testFooter() {
		List<WebElement> elements = page.getFooter();

		// System.out.println(elements.get(0));

	}
	
	
	
	@Test
	public void testScheduleDemoClosed() {
		WebElement element = page.getScheduleDemoClosed();

		String style = element.getAttribute("style");
		boolean contain = true;
		int left = style.indexOf("left: -470px;");
		if (left == -1)
			contain = false;
		System.out.println(style);
		assertEquals("Style should be left: -470px", true, contain);
		contain = true;
		int width = style.indexOf("width: 460px;");
		if (width == -1)
			contain = false;
		System.out.println(style);
		assertEquals("Style should be width: 460px", true, contain);
		int height = style.indexOf("height: 422px;");
		if (height == -1)
			contain = false;
		System.out.println(style);
		assertEquals("Style should be height: 422px", true, contain);
	}

	@Test
	public void verifyFeedBackFooterPageLink() {
		WebElement element = page.getFeedBackFooterPageLink();

		element.findElement(By.id("hylnk_feedback")).click();

		try {
			element.findElement(By.id("FullName"));
			// Success!
			System.out.printf("\n Feed back Page Link is working.");
		} catch (NoSuchElementException ignored) {
			System.out.printf("\n Feed back Page Link is not working.");
		}
		element.findElement(By.id("hyplnk_cancel")).click();

		/*
		 * NEED HELP FIX THIS assertEquals(
		 * "Cancel function from Feed Back Footer Page Link is not return the home page url."
		 * , "http://www.q1a.com", element.getCurrentUrl());
		 */

	}

	@Test
	public void verifyReportABugFooterPageLink() {
		WebElement element = page.getReportABugFooterPageLink();

		element.findElement(By.id("hylnk_feedback")).click();

		element.findElement(By.id("hylnk_reportbug")).click();

		try {
			element.findElement(By.id("Title"));
			// Success!
			System.out.printf("\n Reporter Page Link is working.");
		} catch (NoSuchElementException ignored) {
			System.out.printf("\n Reporter Page is not working.");
		}
		element.findElement(By.id("hyplnk_cancel")).click();
		
		/*
		 * NEED HELP FIX THIS assertEquals(
		 * "Cancel function from Feed Back Footer Page Link is not return the home page url."
		 * , "http://www.q1a.com", element.getCurrentUrl());
		 */

	}

}
