package com.careercenterbdd.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class ApplicantPage {

    WebDriver driver;

    public ApplicantPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(how = How.XPATH, using = "/html/body/app-root/section/main/app-home/div[1]/div/p[3]/a")
    private static WebElement applyNow;

    @FindBy(how = How.XPATH, using = "/html/body/app-root/section/main/app-applicant/div/app-new-applicant/div/div/h4")
    private static WebElement applicationTitle;

    @FindBy(how = How.XPATH, using = "/html/body/app-root/section/main/app-applicant/div/app-new-applicant/div/mat-horizontal-stepper/div[2]/div[1]/form/mat-form-field[1]/div/div[1]/div/input")
    private static WebElement firstName;

    @FindBy(how = How.XPATH, using = "/html/body/app-root/section/main/app-applicant/div/app-new-applicant/div/mat-horizontal-stepper/div[2]/div[1]/form/mat-form-field[2]/div/div[1]/div/input")
    private static WebElement lastName;

    @FindBy(how = How.XPATH, using = "/html/body/app-root/section/main/app-applicant/div/app-new-applicant/div/mat-horizontal-stepper/div[2]/div[1]/form/mat-form-field[3]/div/div[1]/div/input")
    private static WebElement phone;

    @FindBy(how = How.XPATH, using = "/html/body/app-root/section/main/app-applicant/div/app-new-applicant/div/mat-horizontal-stepper/div[2]/div[1]/form/mat-form-field[4]/div/div[1]/div/input")
    private static WebElement email;

    @FindBy(how = How.XPATH, using = "/html/body/app-root/section/main/app-applicant/div/app-new-applicant/div/mat-horizontal-stepper/div[2]/div[1]/form/div/button")
    private static WebElement next;

    @FindBy(how = How.XPATH, using = "/html/body/app-root/section/main/app-applicant/div/app-new-applicant/div/mat-horizontal-stepper/div[2]/div[2]/form/div/button[1]/span")
    private static WebElement back;

    @FindBy(how = How.XPATH, using = "/html/body/app-root/section/main/app-applicant/div/app-new-applicant/div/mat-horizontal-stepper/div[2]/div[2]/form/mat-form-field[1]/div/div[1]/div/input")
    private static WebElement addressText;

    public void clickApplyNow(){
        applyNow.click();
    }

    public WebElement getApplicationTitle(){
        return applicationTitle;
    }

    public WebElement getBackText(){
        return back;
    }
    public void enterFirstName(String fName){
        firstName.sendKeys(fName);
    }

    public void enterLastName(String lName){
        lastName.sendKeys(lName);
    }

    public void enterPhone(String phoneNumber){
        phone.sendKeys(phoneNumber);
    }

    public void enterEmail(String emailAddress){
        email.sendKeys(emailAddress);
    }

    public void clickNext(){
        next.click();
    }

    public void fillApplicantDetails(){
        enterFirstName("Jim");
        enterLastName("Parson");
        enterPhone("1234567890");
        enterEmail("jim@gmail.com");
    }

}
