package runnerClasses;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="./FeatureFiles/SeleniumPageTitles1.feature",glue="stepDefinitions",dryRun=false,plugin={"pretty","html:Reports/SeleniumReport.html"})
public class SeleniumPageRunnerClass
{

}
