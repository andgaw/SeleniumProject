package Test;
import Configuration.Browser;
import Configuration.SelectDriverBrowser;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.time.Duration;
public class TestBase {
    protected WebDriver driver;

    @BeforeTest
    public void beforeTest() {


        driver = Browser.getBrowser(SelectDriverBrowser.CHROME);
        driver.get("https://magento.softwaretestingboard.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.manage().window().maximize();
    }
    @AfterTest
    public void afterTest() {
        driver.close();
        driver.quit();
    }
}