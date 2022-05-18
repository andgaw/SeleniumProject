package Test;

import PageObjects.LoginPage;
import org.openqa.selenium.WebDriver;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;
import static org.testng.AssertJUnit.assertTrue;

public class PositiveLoginTest extends TestBase {

    @Test

    public void LoginTest() {

        LoginPage loginPage = new LoginPage();

        loginPage.typeIntoUserName();
        loginPage.typeIntoUserPassword();
        loginPage.clickOnLoginButton();



     assertEquals("https://www.saucedemo.com/inventory.html", "https://www.saucedemo.com/inventory.html");


    }


}




