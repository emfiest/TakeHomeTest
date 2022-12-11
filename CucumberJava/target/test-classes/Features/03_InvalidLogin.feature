Feature: Invalid Login

Scenario: Log in with incorrect credentials
Given the Hudl home page is open
When I click the Login button
Then the Login page is displayed
When I enter "wrongusername" in the Email field
And I enter "wrongpassword" in the Password field
And I click Login
Then the Login page is displayed
Given I close the browser