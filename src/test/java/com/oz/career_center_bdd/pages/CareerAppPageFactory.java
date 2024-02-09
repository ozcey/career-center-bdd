package com.oz.career_center_bdd.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class CareerAppPageFactory {
	
	private WebDriver driver;
	private LoginPage loginPage;
	private VolunteerPage volunteerPage;
	
	public CareerAppPageFactory(WebDriver driver) {
		this.driver = driver;
		this.loginPage = PageFactory.initElements(driver, LoginPage.class);
		this.volunteerPage = PageFactory.initElements(driver, VolunteerPage.class);
	}
	
	public LoginPage getLoginPage() {
		return loginPage;
	}
	
	public VolunteerPage getVolunteerPage() {
		return volunteerPage;
	}
	
	

}
