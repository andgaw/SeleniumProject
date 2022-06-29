package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Products {


    @FindBy(css = ".shopping_cart_link")
    public static WebElement shoppingCartLink;
    @FindBy(css = ".shopping_cart_badge")
    public static WebElement shoppingCartBadge;
    @FindBy(css = "#item_4_title_link > div:nth-child(1)")
    public static WebElement sauceLabsBackpack;
    @FindBy(css = "#add-to-cart-sauce-labs-backpack")
    public static WebElement addToCardButtonSauceLabsBackpack;
    @FindBy(css = "#remove-sauce-labs-backpack")
    public static WebElement removeButtonSauceLabsBackpack;


    @FindBy(css = "#item_1_title_link > div:nth-child(1)")
    public static WebElement sauceLabsBoltTShirt;
    @FindBy(css = "#add-to-cart-sauce-labs-bolt-t-shirt")
    public static WebElement addToCardSauceLabsBoltTShirt;
    @FindBy(css = "#remove-sauce-labs-bolt-t-shirt")
    public WebElement removeButtonSauceLabsBoltTShirt;


    @FindBy(css = "#item_2_title_link > div:nth-child(1)")
    public static WebElement sauceLabsOnesie;
    @FindBy(css = "#add-to-cart-sauce-labs-onesie")
    public static WebElement addToCardSauceLabsOnesie;
    @FindBy(css = "#remove-sauce-labs-onesie")
    public WebElement removeButtonSauceLabsOnesie;


    @FindBy(css = "#item_0_title_link > div:nth-child(1)")
    public static WebElement sauceLabsBikeLight;
    @FindBy(css = "#add-to-cart-sauce-labs-bike-light")
    public static WebElement addToCardSauceLabsBikeLight;
    @FindBy(css = "#remove-sauce-labs-bike-light")
    public static WebElement removeButtonSauceLabsBikeLight;


    @FindBy(css = "#item_5_title_link > div:nth-child(1)")
    public static WebElement sauceLabsFleeceJacket;
    @FindBy(css = "#add-to-cart-sauce-labs-fleece-jacket")
    public static WebElement addToCardSauceLabsFleeceJacket;
    @FindBy(css = "#remove-sauce-labs-fleece-jacket")
    public static WebElement removeButtonSauceLabsFleeceJacket;


    @FindBy(css = "#item_3_title_link > div:nth-child(1)")
    public static WebElement testAlTheThingsTShirt;
    @FindBy(css = "#add-to-cart-test\\.allthethings\\(\\)-t-shirt-\\(red\\)")
    public static WebElement addToCardTestAlTheThingsTShirt;
    @FindBy(css = "#remove-test\\.allthethings\\(\\)-t-shirt-\\(red\\)")
    public static WebElement removeButtonTestAlTheThingsTShirt;
    @FindBy(css = "#back-to-products")
    public static WebElement backToProductsButton;
    @FindBy(css = "#checkout")
    public static WebElement checkoutButton;

    @FindBy(css = "#first-name")
    public static WebElement firstNameForm;
    @FindBy(css = "#last-name")
    public static WebElement lastNameForm;
    @FindBy(css = "#postal-code")
    public static WebElement postalCodeForm;
    @FindBy(css = "#continue")
    public static WebElement continueButton;
    @FindBy(css = "#finish")
    public static WebElement finishButton;
    @FindBy (css = ".pony_express")
    public static WebElement ponyExpress;

    public Products(WebDriver driver) {

        PageFactory.initElements(driver, this);
    }
}



