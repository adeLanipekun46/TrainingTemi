@test
Feature: Invalid Eligibility

Scenario: Invalid Eligibility Checker(Wrong Date Of Birth)
Given I navigate to  NHS Costs Checker
And I click on Start
And I select Wales as country i live in
And I click on Next
And I enter Date of Birth in wrong format
When I click on Next
Then the error message "There is a problem" is displayed