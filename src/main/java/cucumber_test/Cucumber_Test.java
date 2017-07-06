package cucumber_test;
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
 
@RunWith(Cucumber.class)
@CucumberOptions(
		features = "Feature"
		,glue={"stepDefinition"}
		,monochrome=true
		//,format = {"pretty"}
		)
public class Cucumber_Test {

}
