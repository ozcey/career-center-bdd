package com.oz.career_center_bdd.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

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
		this.webDriverWait.until(ExpectedConditions.visibilityOf(volunteerTitle));
		return this.volunteerTitle.getText();
	}
	
	public void clickSingUpButton() {
		this.signUpButton.click();
	}
	
	public String getVolunteerFormTitle() {
		this.webDriverWait.until(ExpectedConditions.visibilityOf(volunteerFormTitle));
		return this.volunteerFormTitle.getText();
	}
	
	public void enterName(String name) {
		this.name.sendKeys(name);
	}
	
	public void enterPhone(String phone) {
		this.phone.sendKeys(phone);
	}
	
	public void enterEmail(String email) {
		this.email.sendKeys(email);
	}
	

	public void enterJobTitle(String jobTitle) {
		this.jobTitle.sendKeys(jobTitle);
	}
	
	public void enterIndustry(String industry) {
		this.industry.sendKeys(industry);
	}
	
	public void enterAreaOfInterest(String areaOfInterest) {
		this.areaOfInterest.sendKeys(areaOfInterest);
	}
	
	public void clickSubmitButton() {
		this.submitButton.click();
	}
	
	public String getSuccessMessage() {
		this.webDriverWait.until(ExpectedConditions.visibilityOf(successMessage));
		return this.successMessage.getText();
	}
	
	public void clickCloseutton() {
		this.closeButton.click();
	}
	
	

}
