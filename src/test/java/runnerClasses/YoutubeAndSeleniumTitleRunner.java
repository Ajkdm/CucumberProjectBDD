package runnerClasses;

import org.junit.runner.RunWith;
import org.testng.annotations.DataProvider;

import io.cucumber.junit.Cucumber;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="ParallelFeatureFiles",
				 glue={"stepDefinitions","hooks"},
				 dryRun=false,
				 plugin={"pretty","html:Reports/ParallelHtml.html",
						 "json:Reports/ParallelJson.json",
						 "junit:Reports/ParallelJunit.xml"
						 },
				 monochrome=true
				 
				 )
public class YoutubeAndSeleniumTitleRunner extends AbstractTestNGCucumberTests
{
	@DataProvider(parallel=true)
	@Override
	public Object[][] scenarios()
	{
		return super.scenarios();
	}

}
