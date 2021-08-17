package Day9_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class _002_PlaceOrderElements {

    public  _002_PlaceOrderElements(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//button//span[text()='Add to Cart']")
    WebElement addToCartButton;

    @FindBy(xpath = "//button[@class='btn btn-inverse btn-block btn-lg dropdown-toggle']")
    WebElement shoppingCartButton;

    @FindBy(linkText = "Checkout")
    WebElement checkoutButton;

    @FindBy(id = "button-payment-address")
    WebElement continueBillingButton;

    @FindBy(id = "button-shipping-address")
    WebElement continueAddressButton;

    @FindBy(id = "button-shipping-method")
    WebElement continueShippingMethodButton;

    @FindBy(xpath = "//input[@name='agree']")
    WebElement agreeTermsCheckbox;

    @FindBy(id = "button-payment-method")
    WebElement continuePaymentMethodButton;

    @FindBy(id = "button-confirm")
    WebElement confirmOrderButton;

    @FindBy(xpath = "//h1[contains(text(),'order has been placed')]")
    WebElement orderPlacedMessage;

}
