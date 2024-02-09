package com.oz.career_center_bdd.pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class AbstractPage {
	
	protected WebDriverWait webDriverWait;

	public AbstractPage(WebDriver driver) {
		this.webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(30));
		PageFactory.initElements(driver, this);
	}
	
	

}
