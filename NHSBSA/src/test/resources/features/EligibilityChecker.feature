@test
Feature: Eligibility Checker

  Scenario: Valid Eligibility Checker For Under 16years
    Given I navigate to  NHS Costs Checker
    And I click on Start
    And I select Wales as country i live in
    And I click on Next
    And I enter my Date of Birth
    When I click on Next
    Then I see the result page
    And I can see the text "Based on what you've told us You get help with NHS costs"
