package runner.etsy;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;



    @RunWith(Cucumber.class)
   @CucumberOptions(
           features = "src/test/resources/com.etsy/etsySearch.feature",
           glue = "steps/com/etsy1",  // step definition location
           dryRun = false,
           tags="@tc1 and @smoke"
   )
    public class EtsyRunner {


}
