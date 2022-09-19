package Test;

import PageObjects.LoginPage;
import PageObjects.MenuOption;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import static org.testng.AssertJUnit.*;

public class Logout extends TestBase {
    @Test
    public void logoutTest() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.typeIntoUserName1("standard_user");
        loginPage.typeIntoUserPassword("secret_sauce");
        loginPage.clickOnLoginButton();
        MenuOption menuOption = new MenuOption(driver);
        menuOption.clickOnMenuAndLogout();
        assertTrue(loginPage.longinButton.isDisplayed());
    }
}