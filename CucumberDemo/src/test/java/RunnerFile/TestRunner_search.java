package RunnerFile;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features = "C:\\Vision\\eclipse-workspace\\Cucumber_Team_B_Repo\\CucumberDemo\\src\\test\\java\\FeaturesFile\\Csart_Search.featuree",
		glue={"StepDefinition"},		
		tags= {"cscart_se"},
		monochrome = true,
		dryRun=false
		)

public class TestRunner_search {

}
