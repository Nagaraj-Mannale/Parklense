package MyRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(features = "./ParklenseFeature/CUser/UserDeletion.feature",
glue = {"stepdefination","myBrowsers"},
plugin = {"html:./target/User/UD.html"}
)
public class CRunnerUserPage 
{

}
