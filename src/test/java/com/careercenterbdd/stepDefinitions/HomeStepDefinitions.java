package com.careercenterbdd.stepDefinitions;

import com.careercenterbdd.pageObjects.*;
import com.careercenterbdd.utils.Utils;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;

import static org.junit.Assert.assertEquals;

public class HomeStepDefinitions {

    Utils utils;
    WebDriver driver;
    HomePage homePage;
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

//    @Given("I navigate to home page on the website")
//    public void i_navigate_to_home_page_on_the_website() {
//        homePage = pageObjectManager.getHomePage();
//        homePage.navigateToHomePage();
//    }
//
//    @Given("I click on the Apply Now button on home page")
//    public void i_click_on_the_Apply_Now_button_on_home_page() {
//        homePage.clickApplyNow();
//    }
//
//    @Then("I should be taken the successful applicant page")
//    public void i_should_be_taken_the_successful_applicant_page() {
//        String titleText = homePage.getApplicationTitle().getText();
//        utils.waitUntil(homePage.getApplicationTitle());
//        assertEquals("Application Form", titleText);
//    }

    @Then("I click on the Career Center on navigation bar")
    public void i_click_on_the_Career_Center_on_navigation_bar() {
        homePage.clickLogo();
    }

    @Then("I should be taken the successful home page")
    public void i_should_be_taken_the_successful_home_page() {
        String titleText = homePage.getHomeTitle().getText();
        utils.waitUntil(homePage.getHomeTitle());
        assertEquals("Career Planning Center", titleText);
    }

    @Then("I click on the Login button on home page")
    public void i_click_on_the_Login_button_on_home_page() {
        homePage.clickLogin();
    }

    @Then("I should be taken the successful login page")
    public void i_should_be_taken_the_successful_login_page() {
        String titleText = homePage.getLoginTitle().getText();
        utils.waitUntil(homePage.getLoginTitle());
        assertEquals("Login to your account", titleText);
    }

    @Then("I click on the Contact us button on home page")
    public void i_click_on_the_Contact_us_button_on_home_page() {
        homePage.clickContact();
    }

    @Then("I click on the Sign up button on home page")
    public void i_click_on_the_Sign_up_button_on_home_page() {
        homePage.clickSignup();
    }

    @Then("I should be taken the successful volunteer page")
    public void i_should_be_taken_the_successful_volunteer_page() {
        String titleText = homePage.getSignupTitle().getText();
        utils.waitUntil(homePage.getSignupTitle());
        assertEquals("Volunteer Signup Form", titleText);
    }

}
