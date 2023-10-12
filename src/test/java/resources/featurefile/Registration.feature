Feature: Successful user Registration
  @regression
  Scenario: Successful Registration
    Given I am on the Registration Page
    When  I Click on Register button
    And   I enter First Name
    And   I enter Email
    And   I enter the Web address
    And   I enter interests
    And   I enter Password
    And   I enter Confirm password
    And   I Click on the Register button
    Then  I should see the Dashboard Page with personalized greeting & list of 5 job vacancies