package com.registration.pages;

import com.registration.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends Utility {
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    public HomePage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Registration Test')]")
    WebElement checkTextRegistrationTest;

    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Register')]")
    WebElement register;

    public String verifyTextRegistrationTest(){
        String message = getTextFromElement(checkTextRegistrationTest);
        log.info("Getting text of Registration page: " + checkTextRegistrationTest.toString());
        return message;
    }

    public void clickRegisterButtonOnHomePage(){
        log.info("Click on Register button: " + register.toString());
        clickOnElement(register);
    }
}
