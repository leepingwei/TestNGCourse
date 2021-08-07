package Utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.List;

public class ReusableMethods extends BaseDriver{


    // This method will convert WebElement list into String list and returns the String list
    public static List<String> webElementListToStringList(List<WebElement> webElementList){

        List<String> convertedList = new ArrayList<>();

        for (WebElement element : webElementList){
            convertedList.add(element.getText());
        }

        return convertedList;
    }


    // This method will compare two String list and will fail if there is assertion error
    public static void validateTwoStringList(List<String> actualItems, List<String> expectedItems){

        for (int i = 0; i < expectedItems.size(); i++){
            Assert.assertEquals(actualItems.get(i), expectedItems.get(i));
        }
    }


    public void verifySuccessMessage(WebDriver driver){

        WebElement successMessage = driver.findElement(By.xpath("//div[@class='alert alert-success alert-dismissible']"));

        Assert.assertTrue(successMessage.getText().toLowerCase().contains("success"));
    }

}
