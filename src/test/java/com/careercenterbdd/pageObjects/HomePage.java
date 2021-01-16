package com.careercenterbdd.pageObjects;

import com.careercenterbdd.utils.Constants;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(how = How.XPATH, using = "/html/body/app-root/section/app-navbar/div/h5/a")
    private static WebElement logo;

    @FindBy(how = How.XPATH, using = "/html/body/app-root/section/main/app-home/div[1]/div/h1")
    private static WebElement homeTitle;

    @FindBy(how = How.XPATH, using = "/html/body/app-root/section/main/app-home/div[1]/div/p[3]/a")
    private static WebElement applyNow;

    @FindBy(how = How.XPATH, using = "/html/body/app-root/section/main/app-applicant/div/app-new-applicant/div/div/h4")
    private static WebElement applicationTitle;

    @FindBy(how = How.XPATH, using = "/html/body/app-root/section/main/app-home/div[2]/div/div[1]/div[2]/button")
    private static WebElement login;

    @FindBy(how = How.XPATH, using = "/html/body/app-root/section/main/app-login/section/mat-card/mat-card-title")
    private static WebElement loginTitle;

    @FindBy(how = How.XPATH, using = "/html/body/app-root/section/main/app-home/div[2]/div/div[2]/div[2]/button")
    private static WebElement contact;

    @FindBy(how = How.XPATH, using = "/html/body/app-root/section/main/app-home/div[2]/div/div[3]/div[2]/button")
    private static WebElement signup;

    @FindBy(how = How.XPATH, using = "/html/body/app-root/section/main/app-volunteer/app-new-volunteer/div/h4")
    private static WebElement signupTitle;

    public void navigateToHomePage(){
        driver.get(Constants.BaseURL.getName());
    }

    public void clickLogo(){
        logo.click();
    }

    public WebElement getHomeTitle(){
        return homeTitle;
    }

    public void clickApplyNow(){
        applyNow.click();
    }

    public WebElement getApplicationTitle(){
        return applicationTitle;
    }

    public void clickLogin(){
        login.click();
    }

    public WebElement getLoginTitle(){
        return loginTitle;
    }

    public void clickContact(){
        contact.click();
    }

    public void clickSignup(){
        signup.click();
    }

    public WebElement getSignupTitle(){
        return signupTitle;
    }


}
