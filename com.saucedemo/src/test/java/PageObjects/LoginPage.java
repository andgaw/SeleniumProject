package PageObjects;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class LoginPage {
    private Logger logger = LogManager.getRootLogger();
    @FindBy(css = "#user-name")
    public WebElement usernameField;
    @FindBy(css = "#password")
    public WebElement passwordField;
    @FindBy(css = "#login-button")
    public WebElement longinButton;
    @FindBy(css = ".error-message-container > h3:nth-child(1)")
    public WebElement wrongLoginMessage;

    @FindBy(xpath = "//div[@class='product_label']")
    private WebElement productInventory;
    private WebDriver driver;
    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    public void typeIntoUserName1(String username) {
        usernameField.clear();
        usernameField.sendKeys(username);
        logger.info("Typed into User Name Field {}", username);
    }
    public void typeIntoUserPassword(String password) {
        passwordField.clear();
        passwordField.sendKeys(password);
        logger.info("Typed into Password Field {}", password);
    }
    public void clickOnLoginButton() {
        longinButton.click();
        logger.info("Clicked on Login Button");
    }
    public void typeIntoWrongUserName(String username) {
        usernameField.clear();
        usernameField.sendKeys(username);
        logger.info("Typed into wrong username {} ", username);
    }
    public void typeIntoWrongPassword(String password) {
        passwordField.clear();
        passwordField.sendKeys(password);
        logger.info("Typed into wrong Password Field {} ", password);
    }
}
