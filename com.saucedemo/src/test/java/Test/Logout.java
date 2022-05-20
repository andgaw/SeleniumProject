package Test;

import PageObjects.LoginPage;
import PageObjects.LogoutMenuOption;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;


public class Logout extends TestBase  {
    @Test
    public void logoutTest() {


        LoginPage loginPage = new LoginPage();

        LogoutMenuOption logoutMenuOption = new LogoutMenuOption();


        loginPage.typeIntoUserName1();
        loginPage.typeIntoUserPassword();
     loop();
       assertEquals("https://www.saucedemo.com", "https://www.saucedemo.com");


    }
    public void loop(){

        LoginPage loginPage = new LoginPage();
        LogoutMenuOption logoutMenuOption = new LogoutMenuOption();
        loginPage.clickOnLoginButton();
        logoutMenuOption.clickOnMenuAndLogout();






}}