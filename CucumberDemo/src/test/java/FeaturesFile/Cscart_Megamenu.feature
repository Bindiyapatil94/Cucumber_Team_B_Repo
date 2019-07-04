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
Feature: Cscart megamenu feature
  I want to use this template for my feature file

  @tag1
  Scenario: validate megamenu feature of the cscart site
    Given As I am user launch url  in "chrome"
    And navigate to ur "https://demo.cs-cart.com"
    When I enter url  it will show home page
    And As I perform mouse over action on megamenu
    
  
