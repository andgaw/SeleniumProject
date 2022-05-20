package PageObjects;

import Configuration.DriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {


    @FindBy(css = "#user-name")
    private WebElement usernameField;
    @FindBy(css = "#password")
    private WebElement passwordField;
    @FindBy(css = "#login-button")
    private WebElement longinButton;
    @FindBy(css = ".error-message-container > h3:nth-child(1)")
    public WebElement wrongLoginMessage;


    public LoginPage() {

        PageFactory.initElements(DriverManager.getWebDriver(), this);
    }

    public void typeIntoUserName1() {

        usernameField.clear();
        usernameField.sendKeys("standard_user");



    }

    public void typeIntoUserName2() {

        usernameField.clear();
        usernameField.sendKeys("locked_out_user");


    }
    public void typeIntoUserName3() {

        usernameField.clear();
        usernameField.sendKeys("problem_user");


    }
    public void typeIntoUserName4() {

        usernameField.clear();
        usernameField.sendKeys("performance_glitch_user");



    }

    public void typeIntoUserPassword() {
        passwordField.clear();
        passwordField.sendKeys("secret_sauce");
    }

    public void clickOnLoginButton() {
        longinButton.click();

    }

    public void typeIntoWrongUserName() {
        usernameField.clear();
        usernameField.sendKeys("Antonio_Banderas");
    }

    public void typeIntoWrongPassword() {
        passwordField.clear();
        passwordField.sendKeys("El_Mariachi");
    }

}
