package com.registration.steps;

import com.registration.pages.DashboardPage;
import com.registration.pages.RegistrationPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class RegistrationPageSteps {

    @Given("^I am on the Registration Page$")
    public void iAmOnTheRegistrationPage() {
    }


    @And("^I enter First Name$")
    public void iEnterFirstName() {
        new RegistrationPage().enterFirstNameIntoNameField("Abc");
    }


    @And("^I enter Email$")
    public void iEnterEmail() {
        new RegistrationPage().enterEmailIntoEmailField("Abc@google.com");
    }


    @And("^I enter the Web address$")
    public void iEnterTheWebAddress() {
        new RegistrationPage().enterWebAddressIntoWebAddressField("https://www.1234.com");
    }


    @And("^I enter Password$")
    public void iEnterPassword() {
        new RegistrationPage().enterPasswordIntoPasswordField("abc123");
    }


    @And("^I enter interests$")
    public void iEnterInterests() {
        new RegistrationPage().enterInterestsIntoInterestsFiled();
    }


    @And("^I enter Confirm password$")
    public void iEnterConfirmPassword() {
        new RegistrationPage().enterConfirmPasswordIntoConfirmPasswordField("abc123");
    }


    @And("^I Click on the Register button$")
    public void iClickOnTheRegisterButton() {
        new RegistrationPage().clickOnRegister();
    }


    @Then("^I should see the Dashboard Page with personalized greeting & list of (\\d+) job vacancies$")
    public void iShouldSeeTheDashboardPageWithPersonalizedGreetingListOfJobVacancies(int arg0) {
        new DashboardPage().verifyingTextOnDashboardPage();
        new DashboardPage().verifyingRegisterSuccessfulText();
        new DashboardPage().noOfJobsDisplayedOnThePage();
    }
}
