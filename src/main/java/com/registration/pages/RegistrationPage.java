package com.registration.pages;

import com.registration.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegistrationPage extends Utility {
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    public RegistrationPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Registration')]")
    WebElement checkRegistrationText;

    @CacheLookup
    @FindBy(xpath = "//input[@id='name']")
    WebElement firstName;

    @CacheLookup
    @FindBy(xpath = "//input[@id='email']")
    WebElement emailAddress;

    @CacheLookup
    @FindBy(xpath = "//input[@id='url']")
    WebElement webAddress;

    @CacheLookup
    @FindBy(id = "jobInterests")
    WebElement interests;

    @CacheLookup
    @FindBy(xpath = "//input[@id='password']")
    WebElement password;

    @CacheLookup
    @FindBy(xpath = "//input[@id='confirmPassword']")
    WebElement confirmPassword;

    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Register')]")
    WebElement registerButton;


    public String verifyingTextOnRegistrationPage() {
        String message = getTextFromElement(checkRegistrationText);
        log.info("Getting text from registration Page: " + checkRegistrationText.toString());
        return message;
    }

    public void  enterFirstNameIntoNameField(String name) {
        log.info("Enter first name: " + firstName.toString());
        sendTextToElement(firstName, name );
    }

    public void enterEmailIntoEmailField(String email){
        log.info("Enter email: "+emailAddress.toString());
        sendTextToElement(emailAddress, email);
    }

    public void enterWebAddressIntoWebAddressField(String weba) {
        log.info("Enter the web address: " + webAddress.toString());
        sendTextToElement(webAddress, weba);
    }

    public void enterInterestsIntoInterestsFiled() {
        driver.switchTo().frame("iframe");
        interests.sendKeys("Travelling");
        log.info("Enter interests: " + interests.toString());
        driver.switchTo().defaultContent();
    }

    public void enterPasswordIntoPasswordField(String pswd) {
        log.info("Enter the password: " + password.toString());
        sendTextToElement(password, pswd);
    }

    public void enterConfirmPasswordIntoConfirmPasswordField(String confirmpswd){
        log.info("Enter confirm password: " + confirmPassword.toString());
        sendTextToElement(confirmPassword, confirmpswd);
    }

    public void clickOnRegister(){
        log.info("Click on Register button: " + registerButton);
        clickOnElement(registerButton);
    }

}
