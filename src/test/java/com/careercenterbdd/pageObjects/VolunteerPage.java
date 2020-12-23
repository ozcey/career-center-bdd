package com.careercenterbdd.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class VolunteerPage {

    WebDriver driver;

    public VolunteerPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(how = How.XPATH, using = "//*[@id=\"cdk-step-content-0-0\"]/form/mat-form-field[1]/div/div[1]/div")
    private static WebElement firstName;

    @FindBy(how = How.XPATH, using = "//*[@id=\"cdk-step-content-0-0\"]/form/mat-form-field[2]/div/div[1]/div")
    private static WebElement lastName;

    @FindBy(how = How.XPATH, using = "//*[@id=\"mat-input-2\"]")
    private static WebElement phone;

    @FindBy(how = How.XPATH, using = "//*[@id=\"cdk-step-content-0-0\"]/form/mat-form-field[4]/div/div[1]/div")
    private static WebElement email;

    @FindBy(how = How.XPATH, using = "//*[@id=\"cdk-step-content-0-0\"]/form/div/button/span")
    private static WebElement next;

    public void enterFirstName(String fName){
        firstName.sendKeys(fName);
    }

    public void enterLastName(String lName){
        firstName.sendKeys(lName);
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
