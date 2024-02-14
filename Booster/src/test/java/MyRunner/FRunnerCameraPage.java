package MyRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "./ParklenseFeature/FCamera/CameraDeletion.feature",
                    glue = {"stepdefination","myBrowsers"},
                   plugin = {"html:./target/Camera/deletion.html"}
		)


public class FRunnerCameraPage {

}
