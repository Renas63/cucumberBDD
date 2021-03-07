package steps.com.webordersteps;

import io.cucumber.java.bs.A;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.weborderpages.GroupOrderPage;
import pages.weborderpages.HomePage;
import pages.weborderpages.LoginPage;
import utils.BrowserUtils;
import utils.ConfiguReader;
import utils.Driver;

public class NewGroupSteps {
    WebDriver driver;
    LoginPage loginPage;
    HomePage homePage;
    GroupOrderPage groupOrderPage;
    @Given("user is on webOrder home page")
    public void user_is_on_web_order_home_page() {

        driver= Driver.getDriver();
        loginPage= new LoginPage(driver);
        driver.navigate().to(ConfiguReader.getProperty("WebOrderUrl"));
        loginPage.login(ConfiguReader.getProperty("WebOrderUsername"),ConfiguReader.getProperty("WebOrderPassword"));
    }

    @Then("user selects the  {string} option")
    public void user_selects_the_option(String text) {
        HomePage homePage= new HomePage(driver);

        BrowserUtils.selectText(homePage.deliveryOptions,text);
    }

    @Then("user is on  the group order page")
    public void user_is_on_the_group_order_page() {
        homePage = new HomePage(driver);
        homePage.groupOrder.click();
        homePage.nextButton.click();

    }

    @Then("user sends a invitees note {string}")
    public void user_sends_a_invitees_note(String note) {
        groupOrderPage= new GroupOrderPage(driver);
        groupOrderPage.sendInviteNote(note);

    }

    @Then("user sends invite list {string} and {string}")
    public void user_sends_invite_list_and(String person1, String person2) {

        groupOrderPage.sendInviteList(person1+ ", " +person2);
        groupOrderPage.clickOrderGroup();

    }

    @Then("user validates {string} text")
    public void user_validates_text(String expectedText) throws InterruptedException {
        Thread.sleep(300);
    String actualText=groupOrderPage.viewGroupOrderHeader.getText();
        Assert.assertEquals(expectedText, actualText);


    }
    @Then("user validates total participant is {int}")
    public void user_validates_total_participant_is(Integer int1) {

        Integer participantNumber= groupOrderPage.getParticipantNumber();
        Assert.assertEquals(int1, participantNumber);
    }

}
