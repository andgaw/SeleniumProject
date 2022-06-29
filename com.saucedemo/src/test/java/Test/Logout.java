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

import static org.testng.AssertJUnit.assertEquals;


public class Logout extends TestBase {


    @Test
    public void logoutTest() throws InterruptedException {


        LoginPage loginPage = new LoginPage(driver);
        loginPage.typeIntoUserName1("standard_user");
        Thread.sleep(1000);

        loginPage.typeIntoUserPassword("secret_sauce");
        loginPage.clickOnLoginButton();
        Thread.sleep(1000);

        MenuOption menuOption = new MenuOption(driver);
        menuOption.clickOnMenuAndLogout();

        assertEquals("https://www.saucedemo.com", "https://www.saucedemo.com");


    }

}