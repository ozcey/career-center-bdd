package com.oz.career_center_bdd.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DriverFactory {
	
	private static ThreadLocal<WebDriver> threadLocal = new ThreadLocal<WebDriver>();
	
	public static WebDriver setDriver(String browser) {
		if(browser.equalsIgnoreCase("chrome")) {
	        System.setProperty("webdriver.chrome.driver", "src/test/java/drivers/chromedriver");
	        ChromeOptions chromeOptions = new ChromeOptions();
	        chromeOptions.setAcceptInsecureCerts(true);
	        chromeOptions.addArguments("--allow-insecure-localhost");
	        chromeOptions.addArguments("--ignore-certificate-errors");
	        threadLocal.set(new ChromeDriver(chromeOptions));
		}
		 getDriver().manage().window().maximize();
		return getDriver();
	}
	
	public static synchronized WebDriver getDriver() {
		return threadLocal.get();
	}
	


}
