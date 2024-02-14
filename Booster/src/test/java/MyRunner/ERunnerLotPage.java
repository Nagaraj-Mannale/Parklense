package MyRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "./ParklenseFeature/ELot/LotUpdate.feature",
                     glue = {"stepdefination","myBrowsers"},
                   plugin = {"html:./target/Lot/Update.html"})

public class ERunnerLotPage {

}
