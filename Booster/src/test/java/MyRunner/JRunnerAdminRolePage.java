package MyRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "./ParklenseFeature/JAdminRole/Creation.feature",
                   glue = {"stepdefination","myBrowsers"},
                   plugin = {"html:./target/AdmintRole/creation.html"}
		        )

public class JRunnerAdminRolePage 
{

}
