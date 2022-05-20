package PageObjects;

import Configuration.DriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogoutMenuOption {
    @FindBy(css = "#react-burger-menu-btn")
    private WebElement menuButtonOnTheLeftSide;
    @FindBy(css = "#logout_sidebar_link")
    private WebElement logOutOptionOnTheMenu;

    public void clickOnMenuAndLogout() {

        PageFactory.initElements(DriverManager.getWebDriver(), this);
        menuButtonOnTheLeftSide.click();
        logOutOptionOnTheMenu.click();



    }
}