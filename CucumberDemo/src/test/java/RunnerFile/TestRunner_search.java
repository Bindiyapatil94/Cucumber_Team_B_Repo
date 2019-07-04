package RunnerFile;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features = "C:\\Users\\RAVI-PC\\workspace\\CucumberDemo\\src\\test\\java\\FeaturesFile\\Csart_Search.feature",
		glue={"StepDefinition"},		
		tags= {"cscart_se"},
		monochrome = true,
		dryRun=false
		)

public class TestRunner_search {

}
