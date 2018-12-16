#Author: your.email@your.domain.com*+*492\
@WebSeach
Feature: Web search

  @Searchcontent1
  Scenario: Search content in google page test
    #################################################################################################
    #  Search the content "Moses" in google page test                                                #                                                  #
    #################################################################################################
    Given Open the browser
    And Navigate to Google page
    When Enter the content "Moses" in the search field
    And Clich the search button
    Then Confirm load the result page sucessfully based on page "Moses - Google Search"
    #################################################################################################
    #  Search the content "Elizabeth" in google page test                                           #                                                  #
    #################################################################################################
    Given Navigate to Google page
    When Enter the content "Elizabeth" in the search field
    And Clich the search button
    Then Confirm load the result page sucessfully based on page "Elizabeth - Google Search"
   