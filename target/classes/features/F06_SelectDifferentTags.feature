@smoke
Feature: Logged user could select different tags
  Scenario: Logged user could select awesome tag
    When user select camera tag
    Then user could find relative results of camera tag
    And user select awesome tag
    Then user could find relative results of awesome tag
    And log out
