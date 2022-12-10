package Test;


import PageObjects.UserAccount;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class LoginUser extends TestBase {
    @Test

    public void UserTestLogin() {
        UserAccount userAccount = new UserAccount(driver);
        userAccount.loginUser(" andyanderson@cedarhill.com", "AndyAnderson1");


    }
}
