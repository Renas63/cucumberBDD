package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;
import java.util.logging.XMLFormatter;

public class EtsyResult {

    public EtsyResult(WebDriver driver){
        PageFactory.initElements(driver,this);

    }
    @FindBy(xpath = "//a//div//h3")
    public List<WebElement> zebraList;

    @FindBy(xpath = "//div/h3/following-sibling::div[contains(@class,'price')]")
    public List<WebElement> priceList;

}
