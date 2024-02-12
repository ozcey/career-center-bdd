package com.oz.career_center_bdd.pages;

import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ApplicantPage extends AbstractPage {

	@FindBy(id = "applicant_page")
	private WebElement applicantButtonOnNavbar;

	@FindBy(id = "applicant_title")
	private WebElement applicantTitle;

	@FindBy(className = "btn-primary")
	private WebElement applyNowButton;

	@FindBy(id = "title")
	private WebElement applicantFormTitle;

	@FindBy(id = "first_name")
	private WebElement firstName;

	@FindBy(id = "last_name")
	private WebElement lastName;

	@FindBy(id = "phone")
	private WebElement phone;

	@FindBy(id = "email")
	private WebElement email;

	@FindBy(id = "next_1")
	private WebElement next1Button;

	@FindBy(id = "street")
	private WebElement street;

	@FindBy(id = "city")
	private WebElement city;

	@FindBy(id = "state")
	private WebElement state;

	@FindBy(id = "zipcode")
	private WebElement zipcode;

	@FindBy(id = "next_2")
	private WebElement next2Button;

	@FindBy(id = "category")
	private WebElement areaOfInterest;

	@FindBy(id = "mat-option-0")
	private WebElement areaOfInterestValue;

	@FindBy(id = "age")
	private WebElement age;

	@FindBy(id = "gender")
	private WebElement gender;

	@FindBy(id = "mat-option-3")
	private WebElement genderValue;

	@FindBy(id = "degree")
	private WebElement degree;

	@FindBy(id = "languages")
	private WebElement languages;

	@FindBy(id = "mat-option-5")
	private WebElement languagesValue;

	@FindBy(id = "next_3")
	private WebElement next3Button;
	
	@FindBy(id = "submit_message")
	private WebElement submitMessage;

	@FindBy(id = "submit")
	private WebElement submitButton;

	@FindBy(id = "successMessage")
	private WebElement successMessage;

	@FindBy(className = "close")
	private WebElement closeButton;

	public ApplicantPage(WebDriver driver) {
		super(driver);
	}

	public void clickApplicantButtonOnNavbar() {
		applicantButtonOnNavbar.click();
	}

	public String getApplicantTitle() {
		waitUntil(applicantTitle);
		return applicantTitle.getText();
	}

	public void clickApplyNowButton() {
		applyNowButton.click();
	}

	public String getApplicantFormTitle() {
		waitUntil(applicantFormTitle);
		return applicantFormTitle.getText();
	}

	public void fillOutContactForm(Map<String, String> values) {
		firstName.sendKeys(values.get("first_name"));
		lastName.sendKeys(values.get("last_name"));
		phone.sendKeys(values.get("phone"));
		email.sendKeys(values.get("email"));
	}

	public void clickNext1Button() {
		next1Button.click();
	}

	public void fillOutAddressForm(Map<String, String> values) {
		street.sendKeys(values.get("street"));
		city.sendKeys(values.get("city"));
		state.sendKeys(values.get("state"));
		zipcode.sendKeys(values.get("zipcode"));
	}

	public void clickNext2Button() {
		next2Button.click();
	}

	public void fillOutJobDetailsForm(Map<String, String> values) {
//		click area of interest drop down
		areaOfInterest.click();
		areaOfInterestValue.click();

		age.sendKeys(values.get("age"));

//		click gender drop down
		gender.click();
		genderValue.click();

		degree.sendKeys(values.get("degree"));
		
//		click languages drop down
		waitUntil(languages);
		languages.click();
		waitUntil(languagesValue);
		languagesValue.click();
	}

	public void clickNext3Button() {
		next3Button.click();
	}
	
	public String getSubmitMessage() {
		waitUntil(submitMessage);
		return submitMessage.getText();
	}
	
	public void clickSubmitButton() {
		this.submitButton.click();
	}
	
	public String getSuccessMessage() {
		waitUntil(successMessage);
		return successMessage.getText();
	}
	
	public void clickCloseutton() {
		this.closeButton.click();
	}

}
