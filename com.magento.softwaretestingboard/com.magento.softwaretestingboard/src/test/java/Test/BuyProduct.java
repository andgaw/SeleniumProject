package Test;
import PageObjects.ProductsForMen;

import org.testng.annotations.Test;


public class BuyProduct extends TestBase {
    @Test
    public void BuyAndProceed() throws InterruptedException {

        ProductsForMen productsForMen = new ProductsForMen(driver);
        productsForMen.BuyProductInMenDepartment();
    }
}


