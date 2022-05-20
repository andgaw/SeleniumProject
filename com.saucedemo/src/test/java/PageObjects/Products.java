package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Products {

    @FindBy(css = "#item_4_title_link > div:nth-child(1)")
    private WebElement sauceLabsBackpack;
    @FindBy(css = "#add-to-cart-sauce-labs-backpack")
    private WebElement addToCardButtonSauceLabsBackpack;
    @FindBy(css = "#remove-sauce-labs-backpack")
    private WebElement removeButtonSauceLabsBackpack;


    @FindBy(css = "#item_1_title_link > div:nth-child(1)")
    private WebElement sauceLabsBoltTShirt;
    @FindBy(css = "#add-to-cart-sauce-labs-bolt-t-shirt")
    private WebElement addToCardSauceLabsBoltTShirt;
    @FindBy(css = "#remove-sauce-labs-bolt-t-shirt")
    private WebElement removeButtonSauceLabsBoltTShirt;


    @FindBy(css = "#item_2_title_link > div:nth-child(1)")
    private WebElement sauceLabsOnesie;
    @FindBy(css = "#add-to-cart-sauce-labs-onesie")
    private WebElement addToCardSauceLabsOnesie;
    @FindBy(css = "#remove-sauce-labs-onesie")
    private WebElement removeButtonSauceLabsOnesie;


    @FindBy(css = "#item_0_title_link > div:nth-child(1)")
    private WebElement sauceLabsBikeLight;
    @FindBy(css = "#add-to-cart-sauce-labs-bike-light")
    private WebElement addToCardSauceLabsBikeLight;
    @FindBy(css = "#remove-sauce-labs-bike-light")
    private WebElement removeButtonSauceLabsBikeLight;


    @FindBy(css = "#item_5_title_link > div:nth-child(1)")
    private WebElement sauceLabsFleeceJacket;
    @FindBy(css = "#add-to-cart-sauce-labs-fleece-jacket")
    private WebElement addToCardSauceLabsFleeceJacket;
    @FindBy(css = "#remove-sauce-labs-fleece-jacket")
    private WebElement removeButtonSauceLabsFleeceJacket;


    @FindBy(css = "#item_3_title_link > div:nth-child(1)")
    private WebElement testAlTheThingsTShirt;
    @FindBy( css = "#add-to-cart-test\\.allthethings\\(\\)-t-shirt-\\(red\\)")
    private WebElement addToCardTestAlTheThingsTShirt;
    @FindBy( css = "#remove-test\\.allthethings\\(\\)-t-shirt-\\(red\\)")
    private WebElement removeButtonTestAlTheThingsTShirt;

}