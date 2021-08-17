package Day9_POM;

import Utils.BaseDriver;
import Utils.ReusableMethods;
import org.testng.Assert;
import org.testng.annotations.Test;

public class _01_PlaceOrderFunction extends BaseDriver {

    @Test
    public void placeOrderTest() {

        ReusableMethods reusableMethods = new ReusableMethods();

        _001_HomePageElements HomepageElements = new _001_HomePageElements(driver);
        _002_PlaceOrderElements PlaceOrderElements = new _002_PlaceOrderElements(driver);

        HomepageElements.searchInput.sendKeys("Palm");

        HomepageElements.searchButton.click();

        PlaceOrderElements.addToCartButton.click();

        PlaceOrderElements.shoppingCartButton.click();

        PlaceOrderElements.checkoutButton.click();

        PlaceOrderElements.continueBillingButton.click();

        PlaceOrderElements.continueAddressButton.click();

        PlaceOrderElements.continueShippingMethodButton.click();

        PlaceOrderElements.agreeTermsCheckbox.click();

        PlaceOrderElements.continuePaymentMethodButton.click();

        PlaceOrderElements.confirmOrderButton.click();

        String orderMessage = PlaceOrderElements.orderPlacedMessage.getText();

        Assert.assertTrue(orderMessage.equals("Your order has been placed!"));

    }

}
