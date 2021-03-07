package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.LinkedList;
import java.util.List;

public class ResultPage {

    public ResultPage(WebDriver driver){
        PageFactory.initElements(driver, this);

    }
    @FindBy(xpath="//a[@class='result__a']")
    public List <WebElement>  seleniumResult;
}
