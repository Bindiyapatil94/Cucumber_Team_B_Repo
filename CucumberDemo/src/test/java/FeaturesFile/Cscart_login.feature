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

  @tag1
  Scenario: login functionality of cscart
    Given As I am user launch chrome browser with "chrome"
    Given I enter an url "https://demo.cs-cart.com"
    And I click on my account 
    And click on signin
    When I enter username as "customer@gmail.com"
    And I enter password "customer"
    And click on signbtn
    Then I validate the login feature
    And close the browser

 
