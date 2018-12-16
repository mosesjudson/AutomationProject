#Author: your.email@your.domain.com
@nriaccountform
Feature: Open NRI Account

  @fillform
  Scenario: Fill the NRI account form test
    Given Open the "Axis" bank NRI Form
    
    When Select the Title of Name 
    And Enter the First Name
    And Enter the Last Name
    And Enter the Email ID
    And Select the country of Residance
    And Enter text as in image
    And Click Authorization
    And Enter Mobile Number
    And Click Submit button
    Then Submitted the NRI form sucessfully
