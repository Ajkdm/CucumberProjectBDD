package runnerClasses;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(plugin="pretty",
				 features="FeatureFiles/SeleniumPage2.feature",
				 glue="stepDefinitions",
				 dryRun=false
				 )
public class Parallel2 
{

}
