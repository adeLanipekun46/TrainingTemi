package stepdefs;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import pageobjects.EligibilityCheckerPage;
import utilities.DriverHook;

import static org.assertj.core.api.Assertions.assertThat;

public class EligibilityCheckerSteps {

    WebDriver driver;

    EligibilityCheckerPage eligibilityCheckerPage;

    public EligibilityCheckerSteps(DriverHook driverHook) {
        driver = driverHook.getDriver();

        eligibilityCheckerPage = new EligibilityCheckerPage(driverHook);

    }

    @Given("I navigate to  NHS Costs Checker")
    public void i_navigate_to_NHS_Costs_Checker() {
        eligibilityCheckerPage.NavigateToWebsite();
    }


    @Given("I click on Start")
    public void i_click_on_Start() {
        eligibilityCheckerPage.Start();
    }


    @Given("I select Wales as country i live in")
    public void i_select_Wales_as_country_i_live_in() {
        eligibilityCheckerPage.clickRadioBtnWales();
    }

    @When("I click on Next")
    public void i_click_on_Next() {
        eligibilityCheckerPage.clickNextBtn();
    }

    @Given("I enter my Date of Birth")
    public void i_enter_my_Date_of_Birth() {
        eligibilityCheckerPage.enterDateOfBirth();
    }


    @Then("I see the result page")
    public void iSeeTheResultPage() {
        assertThat(eligibilityCheckerPage.resultPageIsLoaded()).isTrue();
    }

    @And("I can see the text (.*)")
    public void iCanSeeTheText(String text) {
        assertThat(eligibilityCheckerPage.getResultText().contains(text));
    }

    @And("I enter Date of Birth in wrong format")
    public void iEnterDateOfBirthInWrongFormat() {
        eligibilityCheckerPage.enterWrongDateOfBirth();
    }

    @Then("the error message {string} is displayed")
    public void theErrorMessageIsDisplayed(String text) {
        assertThat(eligibilityCheckerPage.getErrorMessageText().contains(text));
    }

    @And("I enter Date of Birth")
    public void iEnterDateOfBirth() {
        eligibilityCheckerPage.enterDOB();
    }

    @And("I click on No for do you live with a partner")
    public void iClickOnNoForDoYouLiveWithAPartner() {
        eligibilityCheckerPage.clickRadioBtnNo();
    }

    @And("I click on No for claim any benefit or tax credit")
    public void iClickOnNoForClaimAnyBenefitOrTaxCredit() {
        eligibilityCheckerPage.clickRadioBtnNo();
    }

    @And("I click on No for pregnant or given birth in the last {int}months")
    public void iClickOnNoForPregnantOrGivenBirthInTheLastMonths(int arg0) {
        eligibilityCheckerPage.clickRadioBtnNo();
    }

    @And("I click on No for any injuries or illness")
    public void iClickOnNoForAnyInjuriesOrIllness() {
        eligibilityCheckerPage.clickRadioBtnNo();
    }

    @And("I click on No for do you have diabetes")
    public void iClickOnNoForDoYouHaveDiabetes() {
        eligibilityCheckerPage.clickRadioBtnNo();
    }

    @And("I click on No for do you or a family have glaucoma")
    public void iClickOnNoForDoYouOrAFamilyHaveGlaucoma() {
        eligibilityCheckerPage.clickRadioBtnNo();
    }

    @And("I click on Yes for do you live in a care home")
    public void iClickOnNoForDoYouLiveInACareHome() {
        eligibilityCheckerPage.clickRadioBtnYes();
    }

    @And("I click on Yes for do you get help from local council")
    public void iClickOnYesForDoYouGetHelpFromLocalCouncil() {
        eligibilityCheckerPage.clickRadioBtnYes();
    }


    @And("I can see the message {string}")
    public void iCanSeeTheMessage(String text) {

        assertThat(eligibilityCheckerPage.getMessageText().contains(text));
    }
}


