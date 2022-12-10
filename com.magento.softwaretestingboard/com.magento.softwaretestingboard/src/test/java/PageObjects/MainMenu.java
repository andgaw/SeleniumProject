package PageObjects;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;


public class MainMenu {
    private WebDriver driver;


    @FindBy(css = ".logo > img:nth-child(1)")
    WebElement mainSiteLink;
    @FindBy(css = "#ui-id-3 > span:nth-child(1)")
    WebElement whatsNewMenu;
    @FindBy(css = ".category38 > strong:nth-child(1)")
    WebElement whatsNewMenuText;
    @FindBy(css = "#ui-id-8")
    WebElement saleMenu;
    @FindBy(css = ".category37 > strong:nth-child(1)")
    WebElement saleMenuText;
    @FindBy(css = "#ui-id-7")
    WebElement trainingMenu;
    @FindBy(css = ".category9 > strong:nth-child(1)")
    WebElement trainingMenuText;
    @FindBy(css = "#ui-id-6")
    WebElement gearMenu;
    @FindBy(css = ".category3 > strong:nth-child(1)")
    WebElement gearMenuText;
    @FindBy(css = "#ui-id-5")
    WebElement menMenu;
    @FindBy(css = ".category11 > strong:nth-child(1)")
    WebElement menMenuText;
    @FindBy(css = "#ui-id-4")
    WebElement womenMenu;
    @FindBy(css = ".category20 > strong:nth-child(1)")
    WebElement womenMenuText;


    public MainMenu(WebDriver driver) {
      this.driver = driver;
        PageFactory.initElements(driver, this);

    }

    public void MenuTesting() {

        mainSiteLink.click();
        whatsNewMenu.click();
        Assert.assertEquals(whatsNewMenuText.getText(), "What's New");
      womenMenu.click();
          Assert.assertEquals(womenMenuText.getText(),"Women");
        menMenu.click();
          Assert.assertEquals(menMenuText.getText(),"Men");
      gearMenu.click();
         Assert.assertEquals(gearMenuText.getText(),"Gear");
       trainingMenu.click();
         Assert.assertEquals(trainingMenuText.getText(),"Training");
       saleMenu.click();
          Assert.assertEquals(saleMenuText.getText(),"Sale");

    }

}
