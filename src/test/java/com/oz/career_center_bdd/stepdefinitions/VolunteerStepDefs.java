package com.oz.career_center_bdd.stepdefinitions;

import static org.junit.Assert.assertEquals;

import java.util.Map;

import com.oz.career_center_bdd.pages.CareerAppPageFactory;
import com.oz.career_center_bdd.pages.DriverFactory;
import com.oz.career_center_bdd.pages.VolunteerPage;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class VolunteerStepDefs {
	
	
	private VolunteerPage volunteerPage;
	
	@Before
	public void beforeTest() {
		CareerAppPageFactory careerAppPageFactory = new CareerAppPageFactory(DriverFactory.getDriver());
		volunteerPage = careerAppPageFactory.getVolunteerPage();
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
	
	@Then("User fills out sign up form")
	public void user_fills_out_sign_up_form(DataTable dataTable) {
		Map<String, String> formValues = dataTable.asMap(String.class, String.class);
		volunteerPage.fillOutForm(formValues);
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
