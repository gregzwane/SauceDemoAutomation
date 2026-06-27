package runner;

import io.cucumber.testng.CucumberOptions;


@CucumberOptions(
        features = "src/test/resources/features", // Path to feature files
        glue = {"stepdef"}, // Package with step definitions
        tags = "@regression",
        plugin = {"pretty", "html:target/cucumber-reports"}, // Reports
        monochrome = true // Cleaner console output

)

public class runner {
}
