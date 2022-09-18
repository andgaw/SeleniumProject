package Test;

import PageObjects.LoginPage;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class NegativeLoginTest extends TestBase {
    @Test
    public void loginTestWithIncorrectData() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.typeIntoWrongUserName("El_Mariachi");
        loginPage.typeIntoWrongPassword("Antonio_Banderas");
        loginPage.clickOnLoginButton();
        //Thread.sleep(1000);
        assertEquals(loginPage.wrongLoginMessage.getText(), "Epic sadface: Username and password do not match any user in this service");
    }

    @Test
    public void loginLockeduser() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.typeIntoUserName1("locked_out_user");
        loginPage.typeIntoUserPassword("secret_sauce");
        loginPage.clickOnLoginButton();
        assertEquals(loginPage.wrongLoginMessage.getText(), "Epic sadface: Sorry, this user has been locked out.");
    }
}




