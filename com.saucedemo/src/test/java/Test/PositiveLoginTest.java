package Test;

import PageObjects.LoginPage;
import PageObjects.Products;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.*;

public class PositiveLoginTest extends TestBase {
    @Test
    public void LoginTest() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Products products = new Products(driver);
        loginPage.typeIntoUserName1("standard_user");
        loginPage.typeIntoUserPassword("secret_sauce");
        loginPage.clickOnLoginButton();
        assertTrue(products.ProductsTitle.isDisplayed());
    }
}

