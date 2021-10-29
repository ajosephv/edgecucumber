package StepDefinitions;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features",glue={"StepDefinitions"},monochrome = true,
plugin = {"pretty","json:target/jsonReports/reports.json",
		"html:target/HtmlReports","junit:target/JunitReports/report.xml","json:target/cucumber.json"}
)
public class TestRunner {

}
