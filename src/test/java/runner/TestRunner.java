package runner;

import org.testng.annotations.DataProvider;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		plugin= {"pretty","html:target/DsAlgo.html","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
		monochrome=true,
	//	tags="@home",
		dryRun=false,
		features= {"src/test/resources/features"},
		glue={"stepdefinition","hooks"}
		)
public class TestRunner extends AbstractTestNGCucumberTests {
	
	@Override
	@DataProvider(parallel=false)
	public Object[][] scenarios()
	{
		
		Object[][] c= super.scenarios();
		
		return c;
	}
	
}
