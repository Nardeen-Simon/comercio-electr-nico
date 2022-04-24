@smoke
Feature: user can search for any product in the system
  Scenario: user could search for any product with fullname
    And user click on search field
    When user search with product full name
    And press search button
    Then user could find relative results
    And choose the searched item
