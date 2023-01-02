package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = { "src/test/resources/features/Free2DaysDelivery.feature" }, glue = { "stepdefination" })
public class CucumberRunner extends AbstractTestNGCucumberTests {

}


///StorePickup.feature