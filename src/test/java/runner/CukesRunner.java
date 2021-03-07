package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resources/com.weborder","src/test/java/steps/com"},
        glue = "steps/com/",
        dryRun = false

)
public class CukesRunner {


}
