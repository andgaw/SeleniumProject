package PageObjects;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MenuOption {
    private Logger logger = LogManager.getRootLogger();
    @FindBy(css = "#react-burger-menu-btn")
    private WebElement menuButtonOnTheLeftSide;
    @FindBy(css = "#logout_sidebar_link")
    private WebElement logOutOptionOnTheMenu;
    private WebDriver driver;

public MenuOption (WebDriver driver){
    this.driver = driver;
    PageFactory.initElements(driver,this);
}
    public void clickOnMenuAndLogout() {
        PageFactory.initElements(driver, this);

        menuButtonOnTheLeftSide.click();
        logOutOptionOnTheMenu.click();
        logger.info("Logout");


    }
}