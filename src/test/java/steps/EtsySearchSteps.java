package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.EtsyHomePage;
import pages.EtsyResult;
import utils.ConfiguReader;
import utils.Driver;

public class EtsySearchSteps {
    WebDriver driver;
    EtsyHomePage etsyHomePage;
    EtsySearchSteps etsySearchSteps;
    EtsyResult etsyResult;

    @Given("user go to etsy home page")
    public void user_go_to_etsy_home_page() {
        driver = Driver.getDriver();
        driver.get("https://www.etsy.com/");
    }

    @When("User search for for zebra plant")
    public void user_search_for_for_zebra_plant() {
        etsyHomePage = new EtsyHomePage(driver);
        etsyHomePage.searchBox.sendKeys(ConfiguReader.getProperty("searchValue3"));
        etsyHomePage.searchButton.click();
  
    }

    @Then("user sees the results of zebra plant")
    public void user_sees_the_results_of_zebra_plant() {
        etsyResult = new EtsyResult(driver);
        int index = 1;
        for (WebElement text : etsyResult.zebraList) {
            System.out.println(index++ + " ." + text.getText());

        }

    }

    @Then("user see the results of zebra plant price")
    public void user_see_the_results_of_zebra_plant_price() {
        etsyResult = new EtsyResult(driver);
        int index = 1;
        for (WebElement price : etsyResult.priceList) {
            System.out.println(index++ + " ." + price.getText());

        }

    }
}



