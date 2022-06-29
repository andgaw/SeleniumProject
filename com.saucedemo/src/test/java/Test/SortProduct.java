package Test;

import PageObjects.LoginPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

import static org.testng.AssertJUnit.assertEquals;

public class SortProduct extends TestBase {


    @FindBy(css = ".product_sort_container > option:nth-child(3)")
    WebElement sortProductsWebElement;
    @FindBy(css = ".product_sort_container")
    WebElement nameAtoZButton;


    @Test
    public void sort() throws InterruptedException {
        PageFactory.initElements(driver, this);

        LoginPage loginPage = new LoginPage(driver);
        Thread.sleep(1000);
        loginPage.typeIntoUserName1("standard_user");
        Thread.sleep(1000);

        loginPage.typeIntoUserPassword("secret_sauce");
        Thread.sleep(1000);

        loginPage.clickOnLoginButton();


        Select sortDropDown;
        sortDropDown = new Select(nameAtoZButton);
        sortDropDown.selectByIndex(2);
        List<WebElement> options = sortDropDown.getOptions();

        List<String> namesOfOptions = new ArrayList<>();
        for (WebElement option : options) {
            namesOfOptions.add(option.getText());


        }
        assertEquals(getSortProductButton(), "Price (low to high)");

    }

    public String getSortProductButton() {
        String sortButtonText = sortProductsWebElement.getText();
        return sortButtonText;
    }


}



