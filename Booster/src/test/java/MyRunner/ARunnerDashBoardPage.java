package MyRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "./ParklenseFeature/All_Creation",
                     glue = {"stepdefination","myBrowsers"},
                   plugin = {"html:./target/Verify.html"})

              

public class ARunnerDashBoardPage 
{

}
