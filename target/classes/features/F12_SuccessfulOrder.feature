@smoke
Feature: Create successful Order
  Scenario: Create successful Order
    And check the shopping cart
    And select gift wrapping needed
    And click on terms agreement
    And Click on checkout button
    Then Entering Bill information and press continue
    And Shipping method and press continue
    And Payment method and press continue
    And Payment information and press continue
    And Confirm order
    Then show invoice details and print the Details