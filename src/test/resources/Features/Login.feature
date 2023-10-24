Feature: Login

  Scenario: I want to login
    Given User in login page screen
    Then User submit username
    And User submit password
    When Click Login button
    Then User directed to home page