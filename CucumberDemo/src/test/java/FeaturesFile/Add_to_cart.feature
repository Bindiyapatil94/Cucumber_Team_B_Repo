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
@cs_cart   @cs_cart_add_to_cart
Feature: Add to Cart
  To validate products are added in the cart

		
	   Scenario: Add to cart single product
	   Given As I am user launch  browser "chrome"
	   Then  I enter url as "https://demo.cs-cart.com"
	    When I enter "computer" in top search box
	    And click on search submit button 
	    Then page navigates to product search results
	    And product results are displayed
	    When I click on view button
	    Then I click on increment button
	    When I click add to cart button of product
	   Then my cart is updated with product quantity as 1 and correct total price
	    And close the browser
