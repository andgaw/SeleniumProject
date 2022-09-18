package Configuration;
public class Utils {
    public static void setWindowConfiguration() {
        DriverManager.getWebDriver().manage().window().maximize();
    }
    public static void navigateToPage() {
        DriverManager.getWebDriver().navigate().to("https://www.saucedemo.com/");
    }
}