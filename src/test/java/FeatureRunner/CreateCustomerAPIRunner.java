package FeatureRunner;

import org.testng.annotations.Test;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.TestNGCucumberRunner;

@CucumberOptions(

		features = "src/test/resources/featureFiles/CustomerApi.feature", 
		glue = "stepDefinitions/"
		/*
		plugin = {
		"com.cucumber.listener.ExtentCucumberFormatter:target/report.html" }, monochrome = true*/

)

public class CreateCustomerAPIRunner {

	@Test
	public void runCukes() {
		new TestNGCucumberRunner(getClass()).runCukes();
	}

}
