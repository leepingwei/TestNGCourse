package Day4;

import Utils.BaseDriver;
import Utils.ReusableMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class _02_EditAccount extends BaseDriver {

    @Test
    public void editAccountTest(){

        ReusableMethods reusableMethods = new ReusableMethods();

        WebElement myAccountIcon = driver.findElement(By.xpath("//a[@title='My Account']"));
        myAccountIcon.click();

        WebElement myAccountButton = driver.findElement(By.xpath("(//a[text()='My Account'])[1] "));
        myAccountButton.click();

        WebElement editAccountButton = driver.findElement(By.xpath("//li//a[text()='Edit Account']"));
        editAccountButton.click();

        WebElement inputFirstName = driver.findElement(By.id("input-firstname"));
        WebElement inputLastName = driver.findElement(By.id("input-lastname"));

        inputFirstName.clear();
        inputLastName.clear();

        inputFirstName.sendKeys("Jon");
        inputLastName.sendKeys("Snow");

        WebElement continueButton = driver.findElement(By.cssSelector("input[value='Continue']"));
        continueButton.click();

       reusableMethods.verifySuccessMessage(driver);

    }

}
