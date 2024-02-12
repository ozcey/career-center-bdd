package com.oz.career_center_bdd.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class CareerAppPageFactory {
	
	private WebDriver driver;
	private LoginPage loginPage;
	private VolunteerPage volunteerPage;
	private ApplicantPage applicantPage;
	
	public CareerAppPageFactory(WebDriver driver) {
		this.driver = driver;
		this.loginPage = PageFactory.initElements(driver, LoginPage.class);
		this.volunteerPage = PageFactory.initElements(driver, VolunteerPage.class);
		this.applicantPage = PageFactory.initElements(driver, ApplicantPage.class);
	}
	
	public LoginPage getLoginPage() {
		return loginPage == null? new LoginPage(driver): loginPage;
	}
	
	public VolunteerPage getVolunteerPage() {
		return volunteerPage == null? new VolunteerPage(driver): volunteerPage;
	}

	public ApplicantPage getApplicantPage() {
		return applicantPage == null ? new ApplicantPage(driver): applicantPage;
	}
	
	

}
