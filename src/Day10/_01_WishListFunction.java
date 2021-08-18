package Day10;

import Day9_POM._001_HomePageElements;
import Utils.BaseDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class _01_WishListFunction extends BaseDriver {

    /**
     * TASK
     * -Search for "Sony" in the website
     * -Click on "Add to WishList" Button (Heart icon)
     * -Then navigate to "WishList" page
     * -Verify "Sony Vaio" added to your wishList
     *
     * USE PAGE OBJECT MODEL PATTERN
     */

    @Test
    public void wishListTest(){

        _001_HomePageElements HomePageElements = new _001_HomePageElements(driver);
        _00_WishListElements WishlistElements = new _00_WishListElements(driver);

        HomePageElements.searchInput.sendKeys("Sony");

        HomePageElements.searchButton.click();

        WishlistElements.addToWishListButton.click();

        WishlistElements.wishListButton.click();

        String productName = WishlistElements.productName.getText();

        Assert.assertTrue(productName.equalsIgnoreCase("Sony VAIO"));

    }

}
