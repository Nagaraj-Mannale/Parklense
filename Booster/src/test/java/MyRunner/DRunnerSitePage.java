package MyRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "./ParklenseFeature/DSite/SiteDeletion.feature",
	glue = {"stepdefination","myBrowsers"},
    plugin = {"html:./target/Site/Deletion.html"}
 )
                           

public class DRunnerSitePage 
{

}
