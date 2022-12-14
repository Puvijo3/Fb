Feature: Social Networking Application
 Scenario: Home Page
 Given user Launch The Application
 When user Get Text From The WebElement
 When user Click The Sign-up
 And user Enter The Required Information
 But user Get The Invalid Credential Input
 Then user Get The Screenshot Of The Current Page
 