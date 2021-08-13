package Day7.ParallelTesting._04_Groups;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestClass2 {


    @Test(groups = "smoke")
    public void test3() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Library/Selenium/chromedriver/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.espn.com/");

        Thread.sleep(3000);

        driver.quit();
    }


    @Test(groups = "functional")
    public void test4() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Library/Selenium/chromedriver/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.bbc.com/news/world");

        Thread.sleep(3000);

        driver.quit();
    }

}
