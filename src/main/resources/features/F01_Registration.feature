@smoke
Feature: User able to register to the system
  Scenario: User could register with valid data
    Given user is in site page then click register button
    When user enters First name and Last name and Email and Password
    And click on register button
    Then user is navigated to the registration welcome page
