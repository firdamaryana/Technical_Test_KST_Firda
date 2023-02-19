package testRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C://Users//firda//Documents//TechnicalTestFirda//features//ValidateValue.feature",
        glue = "stepDefinitions")
public class TestRunner {
}
