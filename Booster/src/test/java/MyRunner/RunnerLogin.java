package MyRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "./ParklenseFeature/LoginPage/Login.feature",
                     glue = {"stepdefination","myBrowsers"},
                   plugin = {"html:./target/loginReport.html"}
		)

public class RunnerLogin 
{

}
