package com.registration.steps;

import com.registration.pages.HomePage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.testng.Assert;

public class HomePageSteps {

    @Given("^I am on the Home Page$")
    public void iAmOnTheHomePage() {
    }


    @And("^I Verify Registration Test text on Home Page$")
    public void verifyRegistrationTestTextOnHomePage() {
        String expectedText = "Registration Test";
        String actualText = new HomePage().verifyTextRegistrationTest();
        Assert.assertEquals(expectedText, actualText, "Text not displayed");
    }


    @Then("^I Click on Register button$")
    public void clickOnRegisterButton() {
        new HomePage().clickRegisterButtonOnHomePage();
    }
}
