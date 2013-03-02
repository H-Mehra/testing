package com.q1a.auto;

import static org.junit.Assert.assertEquals;

import java.util.List;
import java.util.NoSuchElementException;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.q1a.auto.com.q1a.auto.page.HomePage;
import com.q1a.auto.com.q1a.auto.page.Page;

public abstract class HomeTestBase {

	protected static WebDriver driver;
	protected static HomePage page;

	@Test
	public void testTitle() {
		String title = driver.getTitle();
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
		WebElement welcome = driver.findElement(By
				.xpath("html/body/div[2]/div[3]/div[1]/div[1]"));
		String text = welcome.getText();
		assertEquals(
				"It's not a welcome Text",
				"Welcome to Q1A � technical skills testing system for IT and software engineering professionals",
				text);

	}

	@Test
	public void testHowItsWork() {
		WebElement how = driver.findElement(By.id("imgvideo"));
		String tagName = how.getTagName();
		assertEquals("This element is not an image", "img", tagName);
		String alt = how.getAttribute("alt");
		assertEquals("Alt should be How it works?", "How it works ?", alt);
		String title = how.getAttribute("title");
		assertEquals("Title should be How it works?", "How it works ?", title);
		String style = how.getAttribute("style");
		assertEquals("Style should be pointer", "cursor: pointer;", style);
		how.click();
	}

	@Test
	public void testFooter() {
		List<WebElement> footers = driver.findElements(By.className("footer").id("id"));
		// System.out.println(footers.get(0));

	}

	@Test
	public void testScheduleDemoClosed() {
		WebElement demo = driver.findElement(By.className("requestwidthright"));
		String style = demo.getAttribute("style");
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

		driver.findElement(By.id("hylnk_feedback")).click();

		try {
			driver.findElement(By.id("FullName"));
			// Success!
			System.out.printf("\n Feed back Page Link is working.");
		} catch (NoSuchElementException ignored) {
			System.out.printf("\n Feed back Page Link is not working.");
		}
		driver.findElement(By.id("hyplnk_cancel")).click();
		assertEquals(
				"Cancel function from Feed Back Footer Page Link is not return the home page url.",
				"http://www.q1a.com", driver.getCurrentUrl());

	}

	@Test
	public void verifyReportABugFooterPageLink() {
		driver.findElement(By.id("hylnk_reportbug")).click();

		try {
			driver.findElement(By.id("Title"));
			// Success!
			System.out.printf("\n Reporter Page Link is working.");
		} catch (NoSuchElementException ignored) {
			System.out.printf("\n Reporter Page is not working.");
		}
		driver.findElement(By.id("hyplnk_cancel")).click();
		assertEquals(
				"Cancel function from Report A Bug Page Link is not return the home page url.",
				"http://www.q1a.com", driver.getCurrentUrl());

	}

}
