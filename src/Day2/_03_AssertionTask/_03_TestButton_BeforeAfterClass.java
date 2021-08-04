package Day2._03_AssertionTask;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.*;

import java.util.concurrent.TimeUnit;

public class _03_TestButton_BeforeAfterClass {

    WebDriver driver;

    /**

        Interview Question:
            How to priorities your @Test in TestNG?
                -I'm using priority keyword after @Test annotation and I can prioritise my tests

     */

    @BeforeClass
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "/Library/Selenium/chromedriver/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.get("https://demoqa.com/buttons");
    }

    @AfterClass
    public void tearDown(){
        driver.quit();
    }

    @Test(priority = 2)
    public void clickMeButtonTest(){

        WebElement clickMeButton = driver.findElement(By.xpath("//button[text()='Click Me']"));
        clickMeButton.click();

        WebElement dynamicClickMessage = driver.findElement(By.id("dynamicClickMessage"));
        String actualResult = dynamicClickMessage.getText();

        String expectedResult = "You have done a dynamic click";

        Assert.assertEquals(actualResult, expectedResult);

    }

    // Enable keyword is ignoring this @Test
    @Test(enabled = false)
    public void rightClickMeButtonTest(){

        WebElement rightClickButton = driver.findElement(By.xpath("//button[text()='Right Click Me']"));
        Actions action = new Actions(driver);

        action.contextClick(rightClickButton).perform();

        WebElement rightClickMessage = driver.findElement(By.id("rightClickMessage"));
        String actualResult = rightClickMessage.getText();

        String expectedResult = "You have done a right click";

        Assert.assertEquals(actualResult, expectedResult);

    }

    @Test(priority = 1)
    public void doubleClickButtonTest(){

        WebElement doubleClickButton = driver.findElement(By.xpath("//button[text()='Double Click Me']"));
        Actions action = new Actions(driver);

        action.doubleClick(doubleClickButton).perform();

        WebElement doubleClickMessage = driver.findElement(By.id("doubleClickMessage"));
        String actualResult = doubleClickMessage.getText();

        String expectedResult = "You have done a double click";

        Assert.assertEquals(actualResult, expectedResult);

    }

}
