package com.oz.career_center_bdd.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class LoginPage extends AbstractPage {
	
	@FindBy(id = "login_page")
	private WebElement loginButtonOnNavbar;
	
	@FindBy(className = "mat-card-title")
	private WebElement loginTitle;
	
	@FindBy(id = "username")
	private WebElement username;
	
	@FindBy(id = "password")
	private WebElement password;
	
	@FindBy(id = "submit")
	private WebElement loginButton;
	
	@FindBy(className = "user_home_title")
	private WebElement userTitle;
	
	@FindBy(id = "logout")
	private WebElement logoutButton;
	
	public LoginPage(WebDriver driver) {
		super(driver);
	}

	public void clickLoginButtonOnNavbar() {
		this.loginButtonOnNavbar.click();
	}

	public String getLoginTitle() {
		this.webDriverWait.until(ExpectedConditions.visibilityOf(loginTitle));
		return this.loginTitle.getText();
	}


	public void enterUsername(String username) {
		this.username.sendKeys(username);
	}


	public void enterPassword(String password) {
		this.password.sendKeys(password);
	}


	public void clickLoginButton() {
		this.loginButton.click();
	}
	
	public String getUserTitle() {
		this.webDriverWait.until(ExpectedConditions.visibilityOf(userTitle));
		return userTitle.getText();
	}
	
	public void clickLogoutButton() {
		this.logoutButton.click();
	}

}
