Feature: Logged in User View

  Scenario: Validate user is able to view after log in
    Given User navigate to login page
    When User successfully entered the login details
    Then User should be able to view the product category page