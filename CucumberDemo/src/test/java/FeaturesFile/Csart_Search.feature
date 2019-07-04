#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@tag
Feature: Title of your feature
  I want to use this template for my feature file
#background
  @positive @search
  Scenario: validate search functionality with valid product
    Given As I am user lauch url in "chrome"
    When I navigate to url " https://demo.cs-cart.com "
    And I validate the page title 
    When I enter product as "computer"
    And then hit enter button of search box
   
   
    And   validate displayed product
    Then close the browser

  
   