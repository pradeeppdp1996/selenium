@Facebook
Feature: To login into adactin hotel app and book room

Scenario: Verify the user login funtionality with invalid crendentails
Given User launch the adactin application
Then User enter the username in the login module
And User enter the password in the login module
And User click on the login button
Then User verify the alert message displays for invalid crendentails
