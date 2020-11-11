package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.DriverHook;


public class EligibilityCheckerPage {

    public WebDriver driver;

    public EligibilityCheckerPage(DriverHook driverHook) {
        driver = driverHook.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "next-button")
    WebElement start;
    @FindBy(css = "#radio-wales")
    WebElement wales;
    @FindBy(css = "#dob-day")
    WebElement day;
    @FindBy(css = "#dob-month")
    WebElement month;
    @FindBy(css = "#dob-year")
    WebElement year;
    @FindBy(css = "#next-button")
    WebElement next;
    @FindBy(css = "main[id='content']")
    WebElement resultPage;
    @FindBy(css = "div[class='done-panel']> h2")
    WebElement resultText;
    @FindBy(css = "#error-summary-heading")
    WebElement errorMessage;
    @FindBy(css = "#radio-no")
    WebElement no;
    @FindBy(css = "#radio-yes")
    WebElement yes;
    @FindBy(css = "div[class='done-panel']> h1")
    WebElement messageText;


    public void NavigateToWebsite() {
        driver.navigate().to("https://services.nhsbsa.nhs.uk/check-for-help-paying-nhs-costs/start");
    }

    public void Start() {
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("next-button")));
        start.click();
    }

    public void clickRadioBtnWales() {
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", wales);

    }

    public void clickNextBtn() {
        next.click();
    }

    public void enterDateOfBirth() {
        day.sendKeys("12");
        month.sendKeys("11");
        year.sendKeys("2009");
    }

    public boolean resultPageIsLoaded() {
        return resultPage.isDisplayed();
    }

    public String getResultText() {
        return resultText.getText();
    }

    public void enterWrongDateOfBirth() {
        day.sendKeys("1");
        month.sendKeys("66");
        year.sendKeys("2001");
    }

    public String getErrorMessageText() {
        return errorMessage.getText();
    }

    public void enterDOB() {
        day.sendKeys("12");
        month.sendKeys("11");
        year.sendKeys("1978");
    }

    public void clickRadioBtnNo() {
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", no);

    }

    public void clickRadioBtnYes() {
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", yes);

    }

    public String getMessageText() {
        return messageText.getText();
    }
}




