package com.careercenterbdd.utils;

import com.careercenterbdd.pageObjects.PageObjectManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Utils {

    WebDriver driver;

    public Utils(WebDriver driver) {
        this.driver = driver;
    }

    public void setUp() {
        System.setProperty(Constants.DRIVER.getName(),Constants.DRIVER_PATH.getName());
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    public PageObjectManager getPageObjectManager(){
        return new PageObjectManager(driver);
    }

    public void tearDown() {
        driver.manage().deleteAllCookies();
        driver.quit();
    }

    public void waitUntil(WebElement element) {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOf(element));
    }

}
