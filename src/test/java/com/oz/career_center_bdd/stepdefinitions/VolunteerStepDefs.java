package com.oz.career_center_bdd.stepdefinitions;

import static org.junit.Assert.assertEquals;

import com.oz.career_center_bdd.pages.CareerAppPageFactory;
import com.oz.career_center_bdd.pages.VolunteerPage;

import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class VolunteerStepDefs {
	
	
	private VolunteerPage volunteerPage;
	private BaseTest baseTest;
	
	@BeforeStep
	public void beforeTest() {
		baseTest = new BaseTest();
		volunteerPage = new CareerAppPageFactory(baseTest.getDriver()).getVolunteerPage();
	}
	
	@Given("User navigates to home page")
	public void user_navigates_to_home_page() {
		baseTest.navigateToHome();
	}

	@Given("User clicks on volunteer button on home page")
	public void user_clicks_on_volunteer_button_on_home_page() {
		volunteerPage.clickVolunteerButtonOnNavbar();
	}

	@Then("User should be taken to volunteer page")
	public void user_should_be_taken_to_volunteer_page() {
		String volunteerTitle = volunteerPage.getVolunteerTitle();
		assertEquals(volunteerTitle, "Volunteer Home");
	}

	@When("User clicks on sign up button")
	public void user_clicks_on_sign_up_button() {
		volunteerPage.clickSingUpButton();
	}
	
	@Then("User should be taken to volunteer sign up page")
	public void user_should_be_taken_to_volunteer_sign_up_page() {
		String volunteerTitle = volunteerPage.getVolunteerFormTitle();
		assertEquals(volunteerTitle, "Volunteer Sign Up Form");
	}

	@When("^User enters name (.+)$")
	public void user_enters_name(String name) {
		volunteerPage.enterName(name);
	}
	
	@Then("^User enters email (.+)$")
	public void user_enters_email(String email) {
	   volunteerPage.enterEmail(email);
	}
	@Then("User enters phone (.+)$")
	public void user_enters_phone(String phone) {
	   volunteerPage.enterPhone(phone);
	}
	@Then("^User enters job title (.+)$")
	public void user_enters_job_title(String jobTitle) {
	   volunteerPage.enterJobTitle(jobTitle);
	}
	@Then("^User enters industry (.+)$")
	public void user_enters_industry_it(String indsutry) {
	    volunteerPage.enterIndustry(indsutry);
	}
	@Then("^User enters area of interest (.+)$")
	public void user_enters_area_of_interest(String areaOfInterest) {
	  volunteerPage.enterAreaOfInterest(areaOfInterest);
	}

	@When("User clicks on submit button")
	public void user_clicks_on_submit_button() {
		volunteerPage.clickSubmitButton();
	}

	@Then("User should see success message")
	public void user_should_see_success_message() {
		String successMessage = volunteerPage.getSuccessMessage();
		assertEquals(successMessage, "Volunteer created successfully.");
		volunteerPage.clickCloseutton();
	}

}
