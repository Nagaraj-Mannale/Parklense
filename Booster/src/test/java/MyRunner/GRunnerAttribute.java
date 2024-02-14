package MyRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "./ParklenseFeature/GAttribute/AbDeletion.feature",
glue = {"stepdefination","myBrowsers"},
plugin = {"html:./target/deletion.html"}
)
public class GRunnerAttribute 
{

}
