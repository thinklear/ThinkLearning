# Author 
# Date 

@smokeScenario
Feature: feature to test login functionality


  Scenario: Check login is suceessful with valid credentials
    Given user is on login page
    When users enters username and password
    And clicks on login button
    Then user is naviagated to the home page

  