package Test;

import Configuration.DriverManager;
import Configuration.Utils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

public class TestBase {
    private WebDriver driver;


    @BeforeMethod
    public void beforeTest() {
        DriverManager.getWebDriver();
        Utils.setWindowConfiguration();
        Utils.navigateToPage();
    }

    @AfterMethod
    public void afterTest() {
        DriverManager.disposeDriver();

    }

}


