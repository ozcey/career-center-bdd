package com.oz.career_center_bdd.stepdefinitions;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import com.oz.career_center_bdd.pages.DriverFactory;
import com.oz.career_center_bdd.utils.PropertyReader;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
	
	private WebDriver driver;
	private Properties properties;
		
	@Before(order = 0)
    public void setUp(){
		properties = PropertyReader.readProperties();
		driver = DriverFactory.setDriver(properties.getProperty("BROWSER"));
    }
    
	@Before(order = 1)
	public void launchBrowser() {
		driver.get(properties.getProperty("BASE_URL"));
	}

    @After
    public void tearDown() {
    	driver.quit();
    }

}
