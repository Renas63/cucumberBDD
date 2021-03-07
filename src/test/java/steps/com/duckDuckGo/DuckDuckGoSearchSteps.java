package steps.com.duckDuckGo;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.DuckDuckGoHomePage;
import pages.ResultPage;
import utils.ConfiguReader;
import utils.Driver;

public class DuckDuckGoSearchSteps {
    WebDriver driver;
    DuckDuckGoHomePage duckDuckGoHomePage;
    DuckDuckGoSearchSteps duckDuckGoSearchSteps;
    ResultPage resultPage;

    @Given("user go to duck duck go home page")
    public void user_go_to_duck_duck_go_home_page() {
        driver= Driver.getDriver();
        driver.get("https://duckduckgo.com/");
    }

    @Then("user search for selenium")
    public void user_search_for_selenium() {
       duckDuckGoHomePage= new DuckDuckGoHomePage(driver);
       duckDuckGoHomePage.searchBox.sendKeys(ConfiguReader.getProperty("searchValue2"));
       duckDuckGoHomePage.searchButton.click();
    }

    @Then("user sees the result of selenium search")
    public void user_sees_the_result_of_selenium_search() {
        resultPage= new ResultPage(driver);
        for(WebElement element: resultPage.seleniumResult){
            Assert.assertTrue(element.getText().contains("Selenium")||element.getText().contains("SELENIUM"));
        }

    }

}
