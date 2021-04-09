package cucumberOptionsRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(  
	    features = "src/test/java/features",
	    		glue="stepDefinitions",
	    //glue="stepDefinitions",tags="@SeleniumTest",strict=true,monochrome=true,
	    		//glue="stepDefinitions1", tags="@SeleniumTest",strict=true,monochrome=true,
	   plugin= {"pretty","html:target/cucumber","json:target/cucumber.json","junit:target/cukes.xml"})
public class Runner{
	
}
