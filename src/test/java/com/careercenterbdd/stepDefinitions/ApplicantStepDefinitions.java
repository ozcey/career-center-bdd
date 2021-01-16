package com.careercenterbdd.stepDefinitions;

import com.careercenterbdd.pageObjects.ApplicantPage;
import com.careercenterbdd.pageObjects.HomePage;
import com.careercenterbdd.pageObjects.PageObjectManager;
import com.careercenterbdd.utils.Utils;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

import static org.junit.Assert.assertEquals;

public class ApplicantStepDefinitions {

    Utils utils;
    WebDriver driver;
    HomePage homePage;
    ApplicantPage applicantPage;
    PageObjectManager pageObjectManager;

    @Before
    public void before() {
        utils = new Utils(driver);
        utils.setUp();
        pageObjectManager = utils.getPageObjectManager();
    }

    @After
    public void after() {
        utils.tearDown();
    }

    @Given("I navigate to home page on the website")
    public void i_navigate_to_home_page_on_the_website() {
        homePage = pageObjectManager.getHomePage();
        homePage.navigateToHomePage();
    }

    @Given("I click on the Apply Now button on home page")
    public void i_click_on_the_Apply_Now_button_on_home_page() {
        applicantPage = pageObjectManager.getApplicantPage();
        applicantPage.clickApplyNow();
    }

    @Then("I should be taken the successful applicant page")
    public void i_should_be_taken_the_successful_applicant_page() {
        String titleText = applicantPage.getApplicationTitle().getText();
        utils.waitUntil(applicantPage.getApplicationTitle());
        assertEquals("Application Form", titleText);
    }

    @Then("I enter a valid first name")
    public void i_enter_a_valid_first_name() {
        applicantPage.enterFirstName("Joe");
    }

    @Then("I enter a valid last name")
    public void i_enter_a_valid_last_name() {
        applicantPage.enterLastName("Doe");
    }

    @Then("I enter a valid phone")
    public void i_enter_a_valid_phone() {
        applicantPage.enterPhone("1234567890");
    }

    @Then("I enter a valid email")
    public void i_enter_a_valid_email() {
        applicantPage.enterEmail("joed@gmail.com");
    }

    @When("I click on the next button on the contact page")
    public void i_click_on_the_next_button_on_the_contact_page() {
        applicantPage.clickNext();
    }

    @Then("I should be taken the successful address form")
    public void i_should_be_taken_the_successful_address_form() {
        String text = applicantPage.getBackText().getText();
        utils.waitUntil(applicantPage.getBackText());
        assertEquals("Back", text);
    }

    @Then("I enter a valid street name")
    public void i_enter_a_valid_street_name() {
        applicantPage.enterAddress("123 Main St");
    }

    @Then("I enter a valid city")
    public void i_enter_a_valid_city() {
        applicantPage.enterCity("Columbia");
    }

    @Then("I enter a valid state")
    public void i_enter_a_valid_state() {
        applicantPage.enterState("MD");
    }

    @Then("I enter a valid zip code")
    public void i_enter_a_valid_zip_code() {
        applicantPage.enterZipcode("12345");
    }

    @When("I click on the next button on the address page")
    public void i_click_on_the_next_button_on_the_address_page() {
        applicantPage.clickNextOnAddress();
    }

    @Then("I should be taken the successful job details form")
    public void i_should_be_taken_the_successful_job_details_form() {
//        String text = applicantPage.getNextTextOnJob().getText();
//        utils.waitUntil(applicantPage.getNextTextOnJob());
//        assertEquals("Next", text);
    }

    @Then("I select a value in Areas of Interest")
    public void i_select_a_value_in_Areas_of_Interest() {
      applicantPage.enterAreaOfInterest();
    }

    @Then("I enter a valid age")
    public void i_enter_a_valid_age() {
        applicantPage.enterAge(32);
    }

    @Then("I select a value in gender")
    public void i_select_a_value_in_gender() {
        applicantPage.enterGender();
    }

    @Then("I enter a valid degree")
    public void i_enter_a_valid_degree() {
        applicantPage.enterDegree("Bachelor");
    }

    @Then("I select a value in languages")
    public void i_select_a_value_in_languages() {
        applicantPage.enterLanguage();
    }

    @When("I click on the next button on the job details page")
    public void i_click_on_the_next_button_on_the_job_details_page() {
        applicantPage.clickNextOnJob();
    }

    @Then("I should be taken the successful done page")
    public void i_should_be_taken_the_successful_done_page() {
        String text = applicantPage.getSubmitMessage().getText();
        utils.waitUntil(applicantPage.getSubmitMessage());
        assertEquals("You are now done. Please submit the form.", text);
    }

    @When("I click on the submit button")
    public void i_click_on_the_submit_button() {
        utils.waitUntil(applicantPage.getSubmitButton());
        applicantPage.clickSubmit();
    }

    @Then("I should see successful message on the page")
    public void i_should_see_successful_message_on_the_page() {
//        String text = applicantPage.getModal().getText();
//        utils.waitUntil(applicantPage.getModal());
//        assertEquals("Something went wrong!", text);
    }

}
