$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("HomePage.feature");
formatter.feature({
  "line": 1,
  "name": "Home Page Test",
  "description": "",
  "id": "home-page-test",
  "keyword": "Feature"
});
formatter.before({
  "duration": 2610991500,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "Negate to Home Page check the text is visible and perform click action Register button",
  "description": "",
  "id": "home-page-test;negate-to-home-page-check-the-text-is-visible-and-perform-click-action-register-button",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 2,
      "name": "@regression"
    }
  ]
});
formatter.step({
  "line": 4,
  "name": "I am on the Home Page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "I Verify Registration Test text on Home Page",
  "keyword": "And "
});
formatter.step({
  "line": 6,
  "name": "I Click on Register button",
  "keyword": "Then "
});
formatter.match({
  "location": "HomePageSteps.iAmOnTheHomePage()"
});
formatter.result({
  "duration": 76280800,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSteps.verifyRegistrationTestTextOnHomePage()"
});
formatter.result({
  "duration": 56112700,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSteps.clickOnRegisterButton()"
});
formatter.result({
  "duration": 158637200,
  "status": "passed"
});
formatter.after({
  "duration": 651161800,
  "status": "passed"
});
formatter.uri("Registration.feature");
formatter.feature({
  "line": 1,
  "name": "Successful user Registration",
  "description": "",
  "id": "successful-user-registration",
  "keyword": "Feature"
});
formatter.before({
  "duration": 1275742700,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "Successful Registration",
  "description": "",
  "id": "successful-user-registration;successful-registration",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 2,
      "name": "@regression"
    }
  ]
});
formatter.step({
  "line": 4,
  "name": "I am on the Registration Page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "I Click on Register button",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "I enter First Name",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "I enter Email",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "I enter the Web address",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I enter interests",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I enter Password",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "I enter Confirm password",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "I Click on the Register button",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "I should see the Dashboard Page with personalized greeting \u0026 list of 5 job vacancies",
  "keyword": "Then "
});
formatter.match({
  "location": "RegistrationPageSteps.iAmOnTheRegistrationPage()"
});
formatter.result({
  "duration": 53200,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSteps.clickOnRegisterButton()"
});
formatter.result({
  "duration": 168132700,
  "status": "passed"
});
formatter.match({
  "location": "RegistrationPageSteps.iEnterFirstName()"
});
formatter.result({
  "duration": 85763300,
  "status": "passed"
});
formatter.match({
  "location": "RegistrationPageSteps.iEnterEmail()"
});
formatter.result({
  "duration": 67749300,
  "status": "passed"
});
formatter.match({
  "location": "RegistrationPageSteps.iEnterTheWebAddress()"
});
formatter.result({
  "duration": 71191500,
  "status": "passed"
});
formatter.match({
  "location": "RegistrationPageSteps.iEnterInterests()"
});
formatter.result({
  "duration": 93876900,
  "status": "passed"
});
formatter.match({
  "location": "RegistrationPageSteps.iEnterPassword()"
});
formatter.result({
  "duration": 59642400,
  "status": "passed"
});
formatter.match({
  "location": "RegistrationPageSteps.iEnterConfirmPassword()"
});
formatter.result({
  "duration": 61172200,
  "status": "passed"
});
formatter.match({
  "location": "RegistrationPageSteps.iClickOnTheRegisterButton()"
});
formatter.result({
  "duration": 82593000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "5",
      "offset": 69
    }
  ],
  "location": "RegistrationPageSteps.iShouldSeeTheDashboardPageWithPersonalizedGreetingListOfJobVacancies(int)"
});
formatter.result({
  "duration": 74645500,
  "status": "passed"
});
formatter.after({
  "duration": 641863900,
  "status": "passed"
});
});