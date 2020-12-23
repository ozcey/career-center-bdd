package com.careercenterbdd.pageObjects;

import org.openqa.selenium.WebDriver;

public class PageObjectManager {

    private WebDriver driver;

    private ApplicantPage applicantPage;

    private VolunteerPage volunteerPage;

    private LoginPage loginPage;

    private HomePage homePage;

    public PageObjectManager(WebDriver driver) {
        this.driver = driver;
    }

    public ApplicantPage getApplicantPage() {
        return applicantPage == null ? applicantPage = new ApplicantPage(driver) : applicantPage;
    }

    public VolunteerPage getVolunteerPage() {
        return volunteerPage == null ? volunteerPage = new VolunteerPage(driver) : volunteerPage;
    }

    public LoginPage getLoginPage() {
        return loginPage == null ? loginPage = new LoginPage(driver) : loginPage;
    }

    public HomePage getHomePage() {
        return homePage == null ? homePage = new HomePage(driver) : homePage;
    }
}
