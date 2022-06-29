package Test;

import PageObjects.LoginPage;
import PageObjects.MenuOption;
import PageObjects.Products;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class AddRemoveAndBuyProducts extends TestBase {


    @Test

    public void addRemoveAndBuy() throws InterruptedException {
        Logger logger = LogManager.getRootLogger();


        LoginPage loginPage = new LoginPage(driver);
        loginPage.typeIntoUserName1("standard_user");
        Thread.sleep(1000);
        loginPage.typeIntoUserPassword("secret_sauce");
        Thread.sleep(1000);
        loginPage.clickOnLoginButton();
        logger.info("Enter to the store");
        Products products = new Products(driver);
        Products.sauceLabsBackpack.click();
        Thread.sleep(1000);
        Products.addToCardButtonSauceLabsBackpack.click();
        Thread.sleep(1000);
        logger.info("Add product to card");
        Products.backToProductsButton.click();
        Thread.sleep(1000);
        Products.shoppingCartBadge.click();
        Thread.sleep(1000);
        assertEquals(Products.shoppingCartLink.getText(), "1");
        Products.removeButtonSauceLabsBackpack.click();
        logger.info("Remove product");
        Assert.assertTrue(Products.shoppingCartLink.isDisplayed());

        MenuOption menuOption = new MenuOption(driver);
        menuOption.clickOnMenuAndLogout();
        logger.info("Logout");
    }


}


