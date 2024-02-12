package com.oz.career_center_bdd.stepdefinitions;

import static org.junit.Assert.assertEquals;

import java.util.Map;

import com.oz.career_center_bdd.pages.ApplicantPage;
import com.oz.career_center_bdd.pages.CareerAppPageFactory;
import com.oz.career_center_bdd.pages.DriverFactory;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ApplicantStepDefs {

	private ApplicantPage applicantPage;

	@Before
	public void beforeTest() {
		CareerAppPageFactory careerAppPageFactory = new CareerAppPageFactory(DriverFactory.getDriver());
		applicantPage = careerAppPageFactory.getApplicantPage();
	}

	@Given("User clicks on applicant button on home page")
	public void user_clicks_on_applicant_button_on_home_page() {
		applicantPage.clickApplicantButtonOnNavbar();
	}

	@Then("User should be taken to applicant page")
	public void user_should_be_taken_to_applicant_page() {
		String applicantTitle = applicantPage.getApplicantTitle();
		assertEquals(applicantTitle, "Applicant Home");
	}

	@When("User clicks on apply now button")
	public void user_clicks_on_apply_now_button() {
		applicantPage.clickApplyNowButton();
	}

	@Then("User should be taken to application form page")
	public void user_should_be_taken_to_application_form_page() {
		String applicantFormTitle = applicantPage.getApplicantFormTitle();
		assertEquals(applicantFormTitle, "Application Form");
	}

	@Then("User fills out contact info")
	public void user_fills_out_contact_info(DataTable dataTable) {
		Map<String, String> contactFormValues = dataTable.asMap(String.class, String.class);
		applicantPage.fillOutContactForm(contactFormValues);
	}

	@Then("User clicks on next button on contact form")
	public void user_clicks_on_next_button() {
		applicantPage.clickNext1Button();
	}

	@Then("User fills out address info")
	public void user_fills_out_address_info(io.cucumber.datatable.DataTable dataTable) {
		Map<String, String> addressFormValues = dataTable.asMap(String.class, String.class);
		applicantPage.fillOutAddressForm(addressFormValues);

	}
	
	@Then("User clicks on next button on address form")
	public void user_clicks_on_next_button_on_address_form() {
		applicantPage.clickNext2Button();
	}

	@Then("User fills out job details info")
	public void user_fills_out_job_details_info(io.cucumber.datatable.DataTable dataTable) {
		Map<String, String> jobDetailFormValues = dataTable.asMap(String.class, String.class);
		applicantPage.fillOutJobDetailsForm(jobDetailFormValues);
	}
	
	@Then("User clicks on next button on job details form")
	public void user_clicks_on_next_button_on_job_detail_form() {
		applicantPage.clickNext3Button();
	}

	@Then("User should be taken to submit page")
	public void user_should_be_taken_to_submit_page() {
		String submitMessage = applicantPage.getSubmitMessage();
		assertEquals(submitMessage, "You are now done. Please submit the form.");
		
	}

	@When("User clicks on submit button on the page")
	public void user_clicks_on_submit_button_on_the_page() {
		applicantPage.clickSubmitButton();
	}

	@Then("User should get success message")
	public void user_should_get_success_message() {
		String successMessage = applicantPage.getSuccessMessage();
		assertEquals(successMessage, "Applicant created successfully");
		applicantPage.clickCloseutton();
	}

}
