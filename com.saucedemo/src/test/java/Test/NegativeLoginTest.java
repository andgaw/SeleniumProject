package Test;

import PageObjects.LoginPage;
import org.testng.annotations.Test;
import static org.testng.AssertJUnit.assertEquals;

public  class NegativeLoginTest extends TestBase {


        @Test

        public void LoginTestWithIncorrectData() {

            LoginPage loginPage = new LoginPage();

            loginPage.typeIntoWrongUserName();
            loginPage.typeIntoWrongPassword();
            loginPage.clickOnLoginButton();


            assertEquals(loginPage.wrongLoginMessage.getText(), "Epic sadface: Username and password do not match any user in this service");
        }
}



