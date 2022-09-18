
package PageObjects;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import static PageObjects.Products.*;
public class CheckoutOrders {
    private Logger logger = LogManager.getRootLogger();
    public void Checkout(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
    public void CheckoutInformation(String firstName, String lastName, String postalCode) {
        firstNameForm.sendKeys(firstName);
        lastNameForm.sendKeys(lastName);
        postalCodeForm.sendKeys(postalCode);
        logger.info("Checkout information to complete orders");
        logger.info("First name {} :", firstName);
        logger.info("Last name {} :", lastName);
        logger.info("Postal code {} :", postalCode);
    }
}
