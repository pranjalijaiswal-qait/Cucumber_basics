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

Feature:  Login Action

Scenario: launch app
	Given User is on Home Page

Scenario Outline: Successful Login with Valid Credentials
	And User enters "<username>" and "<password>"
	Then Message displayed Login Successfully
Examples:
|      username               |  password  |
|pranjalijaiswal119@gmail.com |alldbest@119|

Scenario: Successful LogOut
	When User LogOut from the Application
	Then Message displayed LogOut Successfully


 