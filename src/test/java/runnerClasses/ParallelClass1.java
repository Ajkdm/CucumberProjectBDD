package runnerClasses;


import org.junit.runner.RunWith;
import org.testng.annotations.DataProvider;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;

@RunWith(Cucumber.class)
@CucumberOptions(
				features="./ParallelFeatureFiles",
				glue="parallel",
				dryRun=false,
				plugin={"pretty","html:Reports/Report.html"}
			     )

public class ParallelClass1 extends AbstractTestNGCucumberTests
{
	@Override
    @DataProvider(parallel = true)
    public Object[][] scenarios()
	{
        return super.scenarios();
    }
}
