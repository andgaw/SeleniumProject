package Test;
import PageObjects.LoginPage;
import PageObjects.MenuOption;
import PageObjects.Products;
import io.qameta.allure.Description;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;
import static org.testng.AssertJUnit.assertEquals;

public class AddRemoveAndBuyProducts extends TestBase {

    @Test
    @Description (" the system logs in to the store," +
            " adds a product to the cart, checks if the number of products is correct, " +
            "and then removes the product from the cart and logs the user out of the store.")

    public void addRemoveAndBuy() throws InterruptedException {
        Logger logger = LogManager.getRootLogger();
        LoginPage loginPage = new LoginPage(driver);
        loginPage.typeIntoUserName1("standard_user");
        loginPage.typeIntoUserPassword("secret_sauce");
        loginPage.clickOnLoginButton();
        logger.info("Enter to the store");
        Products products = new Products(driver);
        Products.sauceLabsBackpack.click();
        Products.addToCardButtonSauceLabsBackpack.click();
        logger.info("Add product to card");
        Products.backToProductsButton.click();
        Products.shoppingCartBadge.click();
        assertEquals(Products.shoppingCartLink.getText(), "1");
        Products.removeButtonSauceLabsBackpack.click();
        logger.info("Remove product");
        Assert.assertTrue(Products.shoppingCartLink.isDisplayed());
        MenuOption menuOption = new MenuOption(driver);
        menuOption.clickOnMenuAndLogout();
        logger.info("Logout");
    }
}


