package Utils;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class BaseDriver {

    // Webdriver driver - Access Modifier:
    // should be public or protected
    protected WebDriver driver;

    @BeforeMethod(alwaysRun = true)
    @Parameters({"browser"})
    public void setup(String browser){

        if (browser.equalsIgnoreCase("chrome")){
            System.setProperty("webdriver.chrome.driver", "/Library/Selenium/chromedriver/chromedriver");
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("firefox")){
            System.setProperty("webdriver.gecko.driver", "/Library/Selenium/geckodriver/geckodriver");
            driver = new FirefoxDriver();
        }

        driver.manage().window().maximize();
        driver.get("http://opencart.abstracta.us/index.php?route=common/home");

        WebElement myAccountButton = driver.findElement(By.xpath("//a[@title='My Account']"));
        myAccountButton.click();

        WebElement loginButton = driver.findElement(By.linkText("Login"));
        loginButton.click();

        try {
            // this part is only for chrome browser - not firefox
            WebElement advancedButton = driver.findElement(By.xpath("//button[@id='details-button']"));
            advancedButton.click();

            WebElement proceedLink = driver.findElement(By.xpath("//a[@id='proceed-link']"));
            proceedLink.click();
        } catch (NoSuchElementException e){
            System.out.println("This part is only for Chrome!");
        }

        WebElement username = driver.findElement(By.id("input-email"));
        username.sendKeys("test@techno.com");

        WebElement password = driver.findElement(By.id("input-password"));
        password.sendKeys("Test12345.");

        WebElement submitButton = driver.findElement(By.xpath("//input[@type='submit']"));
        submitButton.click();

        WebElement homePageButton = driver.findElement(By.xpath("//a[text()='Your Store']"));
        homePageButton.click();
    }

    @AfterMethod(alwaysRun = true)
    public void quit(){
        driver.quit();
    }

}
