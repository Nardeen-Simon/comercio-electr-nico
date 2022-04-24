@smoke
Feature: Logged user could add different products to Shopping cart
  Scenario: Logged user could add different products to Shopping cart
    When When user choose the books category
    And click on book item add to cart button
    Then book added to the shopping cart

    When click on another book item add to cart button
    Then another book added to the shopping cart