package testinfrastructure;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = "step_definitions",
        plugin = {"pretty", "html:target/cucumber-reports.html"},
        tags = "@smoke"
)
public class TestRunner {
}
