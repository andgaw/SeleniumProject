package Test;

import PageObjects.CheckoutOrders;
import PageObjects.LoginPage;
import PageObjects.Products;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import static org.testng.AssertJUnit.assertEquals;
public class CompleteOrderTest extends TestBase {
    private Logger logger = LogManager.getRootLogger();
    @Test
    public void completeOrder() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.typeIntoUserName1("standard_user");
        loginPage.typeIntoUserPassword("secret_sauce");
        loginPage.clickOnLoginButton();
        Products products = new Products(driver);
        Products.sauceLabsBackpack.click();
        Products.addToCardButtonSauceLabsBackpack.click();
        Products.backToProductsButton.click();
        Products.sauceLabsBoltTShirt.click();
        Products.addToCardSauceLabsBoltTShirt.click();
        Products.backToProductsButton.click();
        Products.sauceLabsOnesie.click();
        Products.addToCardSauceLabsOnesie.click();
        Products.backToProductsButton.click();
        Products.sauceLabsBikeLight.click();
        Products.addToCardSauceLabsBikeLight.click();
        Products.backToProductsButton.click();
        Products.sauceLabsFleeceJacket.click();
        Products.addToCardSauceLabsFleeceJacket.click();
        Products.backToProductsButton.click();
        Products.testAlTheThingsTShirt.click();
        Products.addToCardTestAlTheThingsTShirt.click();
        Products.shoppingCartBadge.click();
        assertEquals(Products.shoppingCartLink.getText(), "6");
        Products.checkoutButton.click();
        logger.info("Buy all products");
        CheckoutOrders checkoutOrders = new CheckoutOrders();
        logger.info("Click Checkout");
        checkoutOrders.CheckoutInformation("Spurdo", "Spärde", "2137");
        Products.continueButton.click();
        Products.finishButton.click();
        logger.info("Finish orders");
        Assert.assertTrue(Products.ponyExpress.isDisplayed());
    }
}
