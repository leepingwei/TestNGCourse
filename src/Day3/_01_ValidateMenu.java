package Day3;

import Utils.BaseDriver;
import Utils.ReusableMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class _01_ValidateMenu extends BaseDriver {

    @Test
    public void validateMenuTest(){

        List<String> expectedMenuItems = new ArrayList<>();

        expectedMenuItems.add("Desktops");
        expectedMenuItems.add("Laptops & Notebooks");
        expectedMenuItems.add("Components");
        expectedMenuItems.add("Tablets");
        expectedMenuItems.add("Software");
        expectedMenuItems.add("Phones & PDAs");
        expectedMenuItems.add("Cameras");
        expectedMenuItems.add("MP3 Players");

        List<WebElement> actualResult = driver.findElements(By.cssSelector("ul[class='nav navbar-nav'] > li"));

        List<String> actualMenuItems = ReusableMethods.webElementListToStringList(actualResult);

        ReusableMethods.validateTwoStringList(actualMenuItems, expectedMenuItems);
    }

}
