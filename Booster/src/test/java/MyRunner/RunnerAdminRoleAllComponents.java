package MyRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features ="./ParklenseFeature",
                     glue = {"stepdefination","myBrowsers"},
                   plugin = {"html:./Result/CompleateReport.html"}
		)


public class RunnerAdminRoleAllComponents {

}
