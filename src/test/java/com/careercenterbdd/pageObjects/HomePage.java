package com.careercenterbdd.pageObjects;

import com.careercenterbdd.utils.Constants;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void navigateToHomePage(){
        driver.get(Constants.BaseURL.getName());
    }


}
