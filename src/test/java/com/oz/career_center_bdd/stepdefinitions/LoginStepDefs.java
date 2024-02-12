package com.oz.career_center_bdd.stepdefinitions;

import static org.junit.Assert.assertEquals;

import com.oz.career_center_bdd.pages.CareerAppPageFactory;
import com.oz.career_center_bdd.pages.DriverFactory;
import com.oz.career_center_bdd.pages.LoginPage;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefs {

	private LoginPage loginPage;

	@Before
	public void beforeTest() {
		CareerAppPageFactory careerAppPageFactory = new CareerAppPageFactory(DriverFactory.getDriver());
		loginPage = careerAppPageFactory.getLoginPage();
	}
	

	@Given("User clicks on login button on home page")
	public void user_clicks_on_login_button_on_home_page() {
		
		loginPage.clickLoginButtonOnNavbar();
	}

	@Then("User should be taken to login page")
	public void user_should_be_taken_login_page() {
		String loginText = loginPage.getLoginTitle();
		assertEquals("Log in to your account", loginText);
	}

	@Then("^User enters a valid username (.+)$")
	public void user_enters_a_valid_username(String username) {
		loginPage.enterUsername(username);
	}

	@Then("^User enters a valid password (.+)$")
	public void user_enters_a_valid_password(String password) {
		loginPage.enterPassword(password);
	}

	@When("User clicks on login button")
	public void user_clicks_on_login_button() {
		loginPage.clickLoginButton();
	}

	@Then("User should be taken to user page")
	public void user_should_be_taken_to_user_page() {
		String userTitle = loginPage.getUserTitle();
		assertEquals(userTitle, "User Home");
	}

	@When("User clicks on logout button")
	public void user_clicks_on_logout_button() {
		loginPage.clickLogoutButton();
	}

}
