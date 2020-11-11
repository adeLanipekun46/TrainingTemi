package runner;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        glue = {"stepdefs", "utilities"},
        features = {"src/test/resources/features/"},
        plugin = {"json:target/cucumber/cucumber.json",
                "html:target/cucumber-report/cucumber.html",
                "junit:target/cucumber/cucumber.xml"},
        strict = true,
        tags = " @test")

public class CucumberRunner {
}
