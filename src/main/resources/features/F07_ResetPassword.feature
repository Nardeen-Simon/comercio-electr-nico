@smoke
Feature: User could reset his/her password successfully
  Scenario: User could reset his/her password successfully
    Given Navigate to Login Page
    And Click on forget password? button
    When user enter Email
    Then message is displayed "Email with instructions has been sent to you." will displayed