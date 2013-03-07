package com.q1a.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.LoadableComponent;

public abstract class Page<T extends LoadableComponent<T>> extends LoadableComponent<T> {
	
	protected static WebDriver driver;



}
