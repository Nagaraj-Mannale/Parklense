package MyRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "./ParklenseFeature/BClient/Client-End-to-End.feature",
                     glue = {"stepdefination","myBrowsers"},
                   plugin = {"html:./target/Client/End-to-end.html"})

              

public class BRunnerClientHome 
{

}
