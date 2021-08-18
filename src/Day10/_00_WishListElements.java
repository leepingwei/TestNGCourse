package Day10;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class _00_WishListElements {

    public _00_WishListElements(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//button[@data-original-title='Add to Wish List']")
    WebElement addToWishListButton;

    @FindBy(id = "wishlist-total")
    WebElement wishListButton;

    @FindBy(xpath = "//td[@class='text-left']//a")
    WebElement productName;

}
