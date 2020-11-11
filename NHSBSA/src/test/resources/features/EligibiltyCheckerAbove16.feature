@test
Feature: Above 16 Eligibility Check

  Scenario: Valid Eligibility Checker
    Given I navigate to  NHS Costs Checker
    And I click on Start
    And I select Wales as country i live in
    And I click on Next
    And I enter Date of Birth
    And I click on Next
    And I click on No for do you live with a partner
    And I click on Next
    And I click on No for claim any benefit or tax credit
    And I click on Next
    And I click on No for pregnant or given birth in the last 12months
    And I click on Next
    And I click on No for any injuries or illness
    And I click on Next
    And I click on No for do you have diabetes
    And I click on Next
    And I click on No for do you or a family have glaucoma
    And I click on Next
    And I click on Yes for do you live in a care home
    And I click on Next
    And I click on Yes for do you get help from local council
    And I click on Next
    Then I see the result page
    And I can see the message "Based on what you've told us You can apply for help with NHS costs"