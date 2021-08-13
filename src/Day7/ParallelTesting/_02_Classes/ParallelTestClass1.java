package Day7.ParallelTesting._02_Classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ParallelTestClass1 {

    @Test
    public void testMethod1() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "/Library/Selenium/chromedriver/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.facebook.com/");

        Thread.sleep(3000);

        driver.quit();

    }

}
