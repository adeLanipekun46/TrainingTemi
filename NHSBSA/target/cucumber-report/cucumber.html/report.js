$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/EligibilityChecker.feature");
formatter.feature({
  "name": "Eligibility Checker",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@Ade"
    }
  ]
});
formatter.scenario({
  "name": "Valid Eligibility Checker For Under 16years",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Ade"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I navigate to  NHS Costs Checker",
  "keyword": "Given "
});
formatter.match({
  "location": "EligibilityCheckerSteps.i_navigate_to_NHS_Costs_Checker()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on Start",
  "keyword": "And "
});
formatter.match({
  "location": "EligibilityCheckerSteps.i_click_on_Start()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I select Wales as country i live in",
  "keyword": "And "
});
formatter.match({
  "location": "EligibilityCheckerSteps.i_select_Wales_as_country_i_live_in()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on Next",
  "keyword": "And "
});
formatter.match({
  "location": "EligibilityCheckerSteps.i_click_on_Next()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I enter my Date of Birth",
  "keyword": "And "
});
formatter.match({
  "location": "EligibilityCheckerSteps.i_enter_my_Date_of_Birth()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on Next",
  "keyword": "When "
});
formatter.match({
  "location": "EligibilityCheckerSteps.i_click_on_Next()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I see the result page",
  "keyword": "Then "
});
formatter.match({
  "location": "EligibilityCheckerSteps.iSeeTheResultPage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I can see the text \"Based on what you\u0027ve told us You get help with NHS costs\"",
  "keyword": "And "
});
formatter.match({
  "location": "EligibilityCheckerSteps.iCanSeeTheText(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});