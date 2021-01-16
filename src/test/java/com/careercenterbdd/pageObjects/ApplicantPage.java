package com.careercenterbdd.pageObjects;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
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

    @FindBy(how = How.XPATH, using = "/html/body/app-root/section/main/app-applicant/div/app-new-applicant/div/mat-horizontal-stepper/div[2]/div[2]/form/mat-form-field[1]/div/div[1]/div/input")
    private static WebElement address;

    @FindBy(how = How.XPATH, using = "//input[@id='mat-input-5']")
    private static WebElement city;

    @FindBy(how = How.XPATH, using = "//input[@id='mat-input-6']")
    private static WebElement state;

    @FindBy(how = How.XPATH, using = "/html/body/app-root/section/main/app-applicant/div/app-new-applicant/div/mat-horizontal-stepper/div[2]/div[2]/form/mat-form-field[4]/div/div[1]/div/input")
    private static WebElement zipcode;

    @FindBy(how = How.XPATH, using = "/html/body/app-root/section/main/app-applicant/div/app-new-applicant/div/mat-horizontal-stepper/div[2]/div[2]/form/div/button[2]/span")
    private static WebElement nextOnAddress;

    @FindBy(how = How.XPATH, using = "//body/app-root[1]/section[1]/main[1]/app-applicant[1]/div[1]/app-new-applicant[1]/div[1]/mat-horizontal-stepper[1]/div[2]/div[3]/form[1]/mat-form-field[1]/div[1]/div[1]/div[1]")
    private static WebElement areaOfInterest;

    @FindBy(how = How.XPATH, using = "/html/body/div[2]/div[2]/div/div/div/mat-option[1]/span")
    private static WebElement it;

    @FindBy(how = How.XPATH, using = "/html/body/app-root/section/main/app-applicant/div/app-new-applicant/div/mat-horizontal-stepper/div[2]/div[3]/form/mat-form-field[2]/div/div[1]/div/input")
    private static WebElement age;

    @FindBy(how = How.XPATH, using = "/html/body/app-root/section/main/app-applicant/div/app-new-applicant/div/mat-horizontal-stepper/div[2]/div[3]/form/mat-form-field[3]/div/div[1]/div/mat-select/div/div[1]/span")
    private static WebElement gender;

    @FindBy(how = How.XPATH, using = "//*[@id=\"mat-option-3\"]/span")
    private static WebElement male;

    @FindBy(how = How.XPATH, using = "/html/body/app-root/section/main/app-applicant/div/app-new-applicant/div/mat-horizontal-stepper/div[2]/div[3]/form/mat-form-field[4]/div/div[1]/div/input")
    private static WebElement degree;

    @FindBy(how = How.XPATH, using = "/html/body/app-root/section/main/app-applicant/div/app-new-applicant/div/mat-horizontal-stepper/div[2]/div[3]/form/mat-form-field[5]/div/div[1]/div/mat-select/div/div[1]/span")
    private static WebElement language;

    @FindBy(how = How.XPATH, using = "//*[@id=\"mat-option-5\"]/span")
    private static WebElement english;

    @FindBy(how = How.XPATH, using = "//body/app-root[1]/section[1]/main[1]/app-applicant[1]/div[1]/app-new-applicant[1]/div[1]/mat-horizontal-stepper[1]/div[2]/div[3]/form[1]/div[1]/button[2]/span[1]")
    private static WebElement nextOnJob;

    @FindBy(how = How.XPATH, using = "/html/body/app-root/section/main/app-applicant/div/app-new-applicant/div/mat-horizontal-stepper/div[2]/div[4]/p")
    private static WebElement submitMessage;

    @FindBy(how = How.XPATH, using = "//*[@id=\"cdk-step-content-0-3\"]/button/span")
    private static WebElement submit;

    @FindBy(how = How.XPATH, using = " //*[@id=\"cdk-overlay-3\"]/snack-bar-container/simple-snack-bar/span")
    private static WebElement modal;

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

    public void enterAddress(String street){
        address.sendKeys(street);
    }

    public void enterCity(String cityName){
        city.sendKeys(cityName);
    }

    public void enterState(String stateName){
        state.sendKeys(stateName);
    }

    public void enterZipcode(String zip){
        zipcode.sendKeys(zip);
    }

    public void clickNextOnAddress(){
        nextOnAddress.click();
    }

    public void enterAreaOfInterest(){
        areaOfInterest.click();
        it.click();
    }

    public void returnKeys(WebElement element){
        element.sendKeys(Keys.RETURN);
    }

    public void enterAge(int ageVal){
        age.sendKeys(String.valueOf(ageVal));
    }

    public void enterGender(){
        gender.click();
        male.click();
    }

    public void enterDegree(String degreeVal){
        degree.sendKeys(degreeVal);
    }

    public void enterLanguage(){
      language.click();
      english.click();
    }

    public WebElement getNextTextOnJob(){
        return nextOnJob;
    }

    public void clickNextOnJob(){
        nextOnJob.click();
    }

    public WebElement getSubmitMessage(){
        return submitMessage;
    }

    public WebElement getSubmitButton(){
        return submit;
    }

    public void clickSubmit(){
        Actions actions =  new Actions(driver);
        actions.moveToElement(submit).click().perform();
    }

    public WebElement getModal(){
        return modal;
    }
}
