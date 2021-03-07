package steps.com.webordersteps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.weborderpages.LoginPage;
import utils.ConfiguReader;
import utils.Driver;

public class LoginSteps {

    WebDriver driver;
    LoginPage loginPage;

    @Given("user navigate to WebOrder")
    public void user_navigate_to_web_order() {
        driver= Driver.getDriver();
        driver.navigate().to(ConfiguReader.getProperty("WebOrderUrl"));

    }

    @When("user provide the credentials")
    public void user_provide_the_credentials() {
       loginPage= new LoginPage(driver);
       loginPage.login(ConfiguReader.getProperty("WebOrderUsername"),ConfiguReader.getProperty("WebOrderPassword"));
    }

    @Then("user is on home page")
    public void user_is_on_home_page() {
        String expectedTitle="ORDER DETAILS - Weborder";
        String actualTitle= driver.getTitle();
        Assert.assertEquals("Home Page Validation After Login",expectedTitle,actualTitle);
    }

}
