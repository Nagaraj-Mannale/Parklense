package MyRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "./ParklenseFeature/BClient",
                     glue = {"stepdefination","myBrowsers"},
                   plugin = {"html:./target/Client/client.html"})

              

public class BRunnerClientHome 
{

}
