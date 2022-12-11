Feature: Valid Login

Scenario: Log into Hudl website
Given the Hudl home page is open
When I click the Login button
And I enter "" in the Email field
And I enter "" in the Password field
And I click Login
Then the welcome page is displayed
Given I close the browser