Feature: Logout

  Scenario: I want to logout
    Given User in home page
    Then User click hamburger menu
    When User click logout button
    Then User directed to login screen