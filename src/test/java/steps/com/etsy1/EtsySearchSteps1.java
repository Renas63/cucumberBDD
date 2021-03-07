package steps.com.etsy1;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.etsyPages.EtsyHomePage;
import utils.Driver;

public class EtsySearchSteps1 {

    WebDriver driver;
    EtsyHomePage homePage;


    @Given("user navigates to {string}")
    public void user_navigates_to(String url) {
        driver= Driver.getDriver();
        driver.get(url);
    }

    @When("user search with {string}")
    public void user_search_with(String searchValue) {
    homePage= new EtsyHomePage(driver);
    homePage.etsySendKey(searchValue);
    }

    @Then("user should see the title {string}")
    public void user_should_see_the_title(String expectedTitle) {

        String actualTitle= driver.getTitle();
        Assert.assertEquals("Validation of the title" ,expectedTitle, actualTitle);
    }

}
