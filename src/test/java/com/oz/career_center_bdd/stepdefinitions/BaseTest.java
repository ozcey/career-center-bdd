package com.oz.career_center_bdd.stepdefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class BaseTest {
	
	protected static WebDriver driver;
	private static final String BASE_URL = "http://localhost:4200";
	
	@Before
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "src/test/java/drivers/chromedriver");
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.setAcceptInsecureCerts(true);
        chromeOptions.addArguments("--allow-insecure-localhost");
        chromeOptions.addArguments("--ignore-certificate-errors");
        driver = new ChromeDriver(chromeOptions);
        driver.manage().window().maximize();
    }
	
	public WebDriver getDriver() {
		return driver;
	}
    
	public void navigateToHome() {
		driver.get(BASE_URL);
	}

    @After
    public void tearDown() {
    	driver.quit();
    }

}
