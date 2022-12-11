Feature: Hudl Login Page
#I would have liked to spend some more time here to confirm 
#the screen elements are displayed (labels, buttons, checkbox)

Scenario: Login page is displayed 
Given the Hudl home page is open
When I click the Login button
Then the Login page is displayed
#And the Login page screen elements are displayed
Given I close the browser