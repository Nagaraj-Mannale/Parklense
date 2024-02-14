package MyRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "./ParklenseFeature/ADashBoard",
                     glue = {"stepdefination","myBrowsers"},
                   plugin = {"html:./target/ADashBoard.html"})

              

public class ARunnerDashBoardPage 
{

}
