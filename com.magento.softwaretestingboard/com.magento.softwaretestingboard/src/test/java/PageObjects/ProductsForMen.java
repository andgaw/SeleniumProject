package PageObjects;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import org.openqa.selenium.support.ui.ExpectedConditions;

import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import waits.WaitForElement;

import java.sql.DriverManager;
import java.time.Duration;

public class ProductsForMen {
    @FindBy(css = "li.product-item:nth-child(1) > div:nth-child(1) > div:nth-child(2) > strong:nth-child(1) > a:nth-child(1)")
    private WebElement argusAllWeatherTank;
    @FindBy(css = "#option-label-size-143-item-167")
    private WebElement argusAllWeatherTankSizeSButton;
    @FindBy(css = "div.swatch-attribute:nth-child(1) > span:nth-child(2)")
    private WebElement argusAllWeatherTankSizeSText;
    @FindBy(css = "#option-label-color-93-item-52")
    private WebElement argusAllWeatherTankChooseColorButtonGray;
    @FindBy(css = "div.swatch-attribute:nth-child(2) > span:nth-child(2)")
    private WebElement argusAllWeatherTankChooseColorTextGray;
    @FindBy(css = "#qty")
    private WebElement quantity;
    @FindBy(css = "#product-addtocart-button")
    private WebElement addToCard;

    @FindBy(css = ".showcart")
    private WebElement basketIcon;

    @FindBy(css = "ul.checkout > li:nth-child(1) > button:nth-child(1) > span:nth-child(1)")
    private WebElement proceedToCheckoutInShippingCart;

    @FindBy(css = "div.title > strong:nth-child(1) > span:nth-child(1)")
    private WebElement itemsInBasket;
    @FindBy(css = ".table-checkout-shipping-method > tbody:nth-child(2) > tr:nth-child(1) > td:nth-child(1) > input:nth-child(1)")
    private WebElement shippingMethodsTableRate;
    @FindBy(css = ".button > span:nth-child(1)")
    private WebElement nextButtonAndCheckout;
    @FindBy(css = ".checkout > span:nth-child(1)")
    private WebElement placeOrderButton;
    @FindBy(xpath = "\"//*[@id=\\\"top-cart-btn-checkout\\\"]\"")
    private WebElement proceedToCheckoutButton;
    private WebDriver driver;


    public ProductsForMen(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }


    public void BuyProductInMenDepartment() {
        MainMenu mainMenu = new MainMenu(driver);
        UserAccount userAccount = new UserAccount(driver);
        WaitForElement waitForElement = new WaitForElement();
        userAccount.getSignInButtonOnMainPage().click();
        userAccount.loginUser("andyanderson@cedarhill.com", "AndyAnderson1");
        mainMenu.getMenMenu().click();
        argusAllWeatherTank.click();
        argusAllWeatherTankSizeSButton.click();
        Assert.assertEquals(argusAllWeatherTankSizeSText.getText(), "S");
        argusAllWeatherTankChooseColorButtonGray.click();
        Assert.assertEquals(argusAllWeatherTankChooseColorTextGray.getText(), "Gray");
        quantity.click();
        quantity.clear();
        quantity.sendKeys("1");
        addToCard.click();
        basketIcon.click();
        WaitForElement.waitUntilElementIsClickable(proceedToCheckoutButton);
        proceedToCheckoutButton.click();
        basketIcon.click();
        proceedToCheckoutButton.click();
        shippingMethodsTableRate.click();
        nextButtonAndCheckout.click();


    }


}



