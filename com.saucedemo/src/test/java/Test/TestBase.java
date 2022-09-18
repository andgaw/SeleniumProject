package Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;

import java.time.Duration;
public class TestBase {
    protected WebDriver driver;
    @BeforeTest
    public void beforeTest() {
        System.setProperty("webdriver.chrome.driver", "C:/drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.navigate().to("https://www.saucedemo.com/");
        driver.manage().window().maximize();
    }
    @AfterMethod
    public void afterTest() {
        driver.close();
        driver.quit();
    }
}