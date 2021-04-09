Feature: Search and place order for vegetables

@SeleniumTest
Scenario: Search for items and validate results
Given User is on Greencart Landing Page
When User searched for "Cucumber" vegetable
Then "Cucumber" results are displayed
