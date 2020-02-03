@Facebook
Feature: Facebook web application smoke test cases
This includes login, singup and forget password functionality

Scenario: Verify the user login funtionality with invalid crendentails
Given User launch the facebook application
Then User verify the facebook logo is displayed in the header
And User enter the emailid in the login module
And User enter the password in the login module
And User click on the login button
Then User verify the alert message displays for invalid crendentails

Scenario: Verify the forget password functionality
Given User click on the facebook logo
When User click on the forget password link
Then User verify the "Find Your Account" in the page header 
When User enter the identify email id in the find the account module
And User click on the submit button 
Then User verify the "Enter Security Code" in the pagge header
