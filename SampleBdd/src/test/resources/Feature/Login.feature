Feature: Login

Scenario: Validate the login page
    Given User is on login page
    When user enters username and password
    And clicks on login button
    Then user is navigated to the home page
