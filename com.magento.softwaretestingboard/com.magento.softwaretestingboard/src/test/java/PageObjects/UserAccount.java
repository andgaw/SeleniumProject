package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;



public class UserAccount {


    @FindBy(css = "ul.header:nth-child(2) > li:nth-child(2) > a:nth-child(1)")
    WebElement signInButtonOnMainPage;
    @FindBy(css = "ul.header:nth-child(2) > li:nth-child(3) > a:nth-child(1)")
    WebElement createAccountButton;
    @FindBy(css = "#email")
    WebElement userEmail;
    @FindBy(css = "div.field:nth-child(3) > div:nth-child(2) > input:nth-child(1)")
    WebElement userPassword;
    @FindBy(css = "button.login > span:nth-child(1)")
    WebElement signInButtonOnLoginPage;
    @FindBy(css = "fieldset.fieldset > div:nth-child(4) > div:nth-child(2) > input:nth-child(1)")
    WebElement captcha;
    @FindBy(css = "ul.header:nth-child(2) > li:nth-child(1) > span:nth-child(1)")
    WebElement welcomeMsg;
    @FindBy (css  = "p.cf-tweet-this")
    WebElement contactUserInfo;
   protected WebDriver driver;

    public  UserAccount( WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void loginUser(String email, String password) {
        signInButtonOnMainPage.click();
        userEmail.sendKeys(email);
        userPassword.sendKeys(password);

      //  String captchaVal = JOptionPane.showInputDialog("Please enter the captcha value:");
    //    captcha.sendKeys(captchaVal);
        signInButtonOnLoginPage.click();
        Assert.assertEquals(welcomeMsg.getText(),contactUserInfo.getText());
    }


}

