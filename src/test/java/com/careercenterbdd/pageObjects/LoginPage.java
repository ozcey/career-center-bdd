package com.careercenterbdd.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(how = How.XPATH, using = "/html/body/app-root/section/main/app-login/section/mat-card/form/mat-form-field[1]/div/div[1]/div[3]")
    private static WebElement username;

    @FindBy(how = How.XPATH, using = "//*[@id=\"mat-input-15\"]")
    private static WebElement password;

    @FindBy(how = How.XPATH, using = "/html/body/app-root/section/main/app-login/section/mat-card/form/button/span")
    private static WebElement login;

    public void enterUsername(String uname){
        username.sendKeys(uname);
    }

    public void enterPassword(String pass){
        password.sendKeys(pass);
    }

    public void clickNext(){
        login.submit();
    }

    public void fillApplicantDetails(){
        enterUsername("admin");
        enterPassword("password");
    }
}
