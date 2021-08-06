package Day4;

import Utils.BaseDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class _01_Subscribe extends BaseDriver {

    @Test
    public void subscribeFunctionTest() {

        WebElement subscribeNewsletter = driver.findElement(By.linkText("Newsletter"));
        subscribeNewsletter.click();

        String textOfChecked = driver.findElement(By.xpath("//input[@checked='checked']/parent::label")).getText();

        if (textOfChecked.equals("Yes")){
            WebElement noSubscribeButton = driver.findElement(By.xpath("//input[@value='0']"));
            noSubscribeButton.click();
        } else if (textOfChecked.equals("No")){
            WebElement yesSubscribeButton = driver.findElement(By.xpath("//input[@value='1']"));
            yesSubscribeButton.click();
        } else {
            throw new IllegalStateException();
        }

        WebElement continueButton = driver.findElement(By.xpath("//input[@value='Continue']"));
        continueButton.click();

        WebElement successMessage = driver.findElement(By.xpath("//div[@class='alert alert-success alert-dismissible']"));

        Assert.assertEquals(successMessage.getText(), "Success: Your newsletter subscription has been successfully updated!");

    }

}
