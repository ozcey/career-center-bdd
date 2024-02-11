package com.oz.career_center_bdd.pages;

import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class VolunteerPage extends AbstractPage {
	
	@FindBy(id="volunteer_page")
	private WebElement volunteerButtonOnNavbar;
	
	@FindBy(id="volunteer_title")
	private WebElement volunteerTitle;
	
	@FindBy(className ="btn-primary")
	private WebElement signUpButton;
	
	@FindBy(id="title")
	private WebElement volunteerFormTitle;
	
	@FindBy(id="name")
	private WebElement name;
	
	@FindBy(id="email")
	private WebElement email;
	
	@FindBy(id="phone")
	private WebElement phone;
	
	@FindBy(id="jobTitle")
	private WebElement jobTitle;
	
	@FindBy(id="industry")
	private WebElement industry;
	
	@FindBy(id="areaOfInterest")
	private WebElement areaOfInterest;
	
	@FindBy(id="submitButton")
	private WebElement submitButton;
	
	@FindBy(id="successMessage")
	private WebElement successMessage;
	
	@FindBy(className="close")
	private WebElement closeButton;
	
	public VolunteerPage(WebDriver driver) {
		super(driver);
	}
	
	public void clickVolunteerButtonOnNavbar() {
		this.volunteerButtonOnNavbar.click();
	}
	
	public String getVolunteerTitle() {
		waitUntil(volunteerTitle);
		return this.volunteerTitle.getText();
	}
	
	public void clickSingUpButton() {
		this.signUpButton.click();
	}
	
	public String getVolunteerFormTitle() {
		waitUntil(volunteerFormTitle);
		return this.volunteerFormTitle.getText();
	}
	
	public void fillOutForm(Map<String, String> values) {
		this.name.sendKeys(values.get("name"));
		this.email.sendKeys(values.get("email"));
		this.phone.sendKeys(values.get("phone"));
		this.jobTitle.sendKeys(values.get("job_title"));
		this.industry.sendKeys(values.get("industry"));
		this.areaOfInterest.sendKeys(values.get("area_of_interest"));
	}
	
	public void clickSubmitButton() {
		this.submitButton.click();
	}
	
	public String getSuccessMessage() {
		waitUntil(successMessage);
		return this.successMessage.getText();
	}
	
	public void clickCloseutton() {
		this.closeButton.click();
	}
	
	

}
