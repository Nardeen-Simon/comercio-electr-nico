@smoke
Feature: Logged user could add different products to compare list
  Scenario: Logged user could add different products to compare list
    When Click on Digital item add to CompareList button
    Then Digital item added to the CompareList

    When click on another Digital item add to CompareList button
    Then another Digital item added to the CompareList
