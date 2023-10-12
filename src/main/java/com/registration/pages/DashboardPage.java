package com.registration.pages;

import com.registration.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class DashboardPage extends Utility {

    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    public DashboardPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//div[@class='page-header']//h1")
    WebElement checkDashboardText;

    @CacheLookup
    @FindBy(xpath = "//div[@class='alert alert-success']")
    WebElement registerSuccessfulText;

    @CacheLookup
    @FindBy(xpath = "//tbody/tr")
    List<WebElement> noOfJobsDisplayed;


    public String verifyingTextOnDashboardPage(){
        String message = getTextFromElement(checkDashboardText);
        log.info("Verifying Dashboard text on the page: " + checkDashboardText.toString());
        return message;
    }

    public String verifyingRegisterSuccessfulText(){
        String message1 = getTextFromElement(registerSuccessfulText);
        log.info("Verifying Successful Registration message: " + registerSuccessfulText.toString());
        return message1;
    }

    public int noOfJobsDisplayedOnThePage(){
        log.info("Verifying Number of jobs displayed on the page: " + noOfJobsDisplayed.toString());
        return noOfJobsDisplayed.size();
    }
}
