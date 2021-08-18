package Day9_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class _001_HomePageElements {

    public _001_HomePageElements(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//input[@name='search']")
    public WebElement searchInput;

    @FindBy(xpath = "//button[@class='btn btn-default btn-lg']")
    public WebElement searchButton;

}
