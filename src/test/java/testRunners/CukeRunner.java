package testRunners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "Features/",
        glue = {"steps"},
        plugin = {"pretty","html:test-output.html"},
        dryRun = false ,
        monochrome = true
)


public class CukeRunner {
}
