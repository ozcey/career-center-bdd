package com.careercenterbdd.utils;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum Constants {

    CLICK("click"),
    SEND_KEYS("sendKeys"),
    DRIVER("webdriver.chrome.driver"),
    DRIVER_PATH("F:\\PROGRAMMING\\SDET\\Selenium\\chromedriver_win32\\chromedriver.exe"),
    BaseURL("http://localhost:4200");

    private final String name;
}
