package Configuration;

import io.qameta.allure.Step;

public class Utils {
    @Step("Maximizing browser window")
    public static void setWindowConfiguration() {
        DriverManager.getWebDriver().manage().window().maximize();
    }
    @Step("Navigating to URL: {pageUrl}")
    public static void navigateToPage() {
        DriverManager.getWebDriver().navigate().to("https://www.saucedemo.com/");
    }
}