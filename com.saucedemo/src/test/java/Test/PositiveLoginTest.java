package Test;

import PageObjects.LoginPage;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;


public class PositiveLoginTest extends TestBase {


    @Test

    public void LoginTest() throws InterruptedException {


        LoginPage loginPage = new LoginPage(driver);

        loginPage.typeIntoUserName1("standard_user");
        loginPage.typeIntoUserPassword("secret_sauce");
        loginPage.clickOnLoginButton();
        Thread.sleep(1000);


        assertEquals("https://www.saucedemo.com/inventory.html", "https://www.saucedemo.com/inventory.html");


    }


}

