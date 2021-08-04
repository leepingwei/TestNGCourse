package Day2._03_AssertionTask;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class _01_TestButtons {

    @Test
    public void clickMeButtonTest(){
        System.setProperty("webdriver.chrome.driver", "/Library/Selenium/chromedriver/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.get("https://demoqa.com/buttons");

        WebElement clickMeButton = driver.findElement(By.xpath("//button[text()='Click Me']"));
        clickMeButton.click();

        WebElement dynamicClickMessage = driver.findElement(By.id("dynamicClickMessage"));
        String actualResult = dynamicClickMessage.getText();

        String expectedResult = "You have done a dynamic click";

        Assert.assertEquals(actualResult, expectedResult);

        driver.quit();
    }

    @Test
    public void rightClickMeButtonTest(){
        System.setProperty("webdriver.chrome.driver", "/Library/Selenium/chromedriver/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.get("https://demoqa.com/buttons");

        WebElement rightClickButton = driver.findElement(By.xpath("//button[text()='Right Click Me']"));
        Actions action = new Actions(driver);

        action.contextClick(rightClickButton).perform();

        WebElement rightClickMessage = driver.findElement(By.id("rightClickMessage"));
        String actualResult = rightClickMessage.getText();

        String expectedResult = "You have done a right click";

        Assert.assertEquals(actualResult, expectedResult);

        driver.quit();
    }

    @Test
    public void doubleClickButtonTest(){
        System.setProperty("webdriver.chrome.driver", "/Library/Selenium/chromedriver/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.get("https://demoqa.com/buttons");

        WebElement doubleClickButton = driver.findElement(By.xpath("//button[text()='Double Click Me']"));
        Actions action = new Actions(driver);

        action.doubleClick(doubleClickButton).perform();

        WebElement doubleClickMessage = driver.findElement(By.id("doubleClickMessage"));
        String actualResult = doubleClickMessage.getText();

        String expectedResult = "You have done a double click";

        Assert.assertEquals(actualResult, expectedResult);

        driver.quit();
    }

}
