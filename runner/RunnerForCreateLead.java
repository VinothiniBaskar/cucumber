package runner;

import org.testng.annotations.BeforeTest;

import com.framework.testng.api.base.ProjectSpecificMethods;

import cucumber.api.CucumberOptions;

@CucumberOptions(features="src/main/java/features",
glue="runner",
monochrome=true)
public class RunnerForCreateLead extends ProjectSpecificMethods {
	@BeforeTest
	public void setValues() {
		testcaseName = "Create Lead";
		testDescription ="Create Lead with mandatory fields";
		authors="Vino";
		category ="Smoke";
		
	}
}
