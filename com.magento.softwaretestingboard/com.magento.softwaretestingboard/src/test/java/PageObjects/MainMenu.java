package PageObjects;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainMenu {
    private WebDriver driver;

    @FindBy(css = "#ui-id-4")
    WebElement womenMenu;
    @FindBy(css = "#ui-id-12")
    WebElement womenProductsTops;
    @FindBy(css = "#ui-id-13")
    WebElement womanProductsMenuBottoms;

    public MainMenu(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);

    }

    public void womanMenuTesting() {
        womenMenu.click();
        womenProductsTops.isDisplayed();
        womanProductsMenuBottoms.isDisplayed();

    }

}
