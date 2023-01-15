package PageObjects;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;


public class MainMenu {


    @FindBy(css = ".logo > img:nth-child(1)")
    private WebElement mainSiteLink;
    @FindBy(css = "#ui-id-3 > span:nth-child(1)")
    private WebElement whatsNewMenu;
    @FindBy(css = ".category38 > strong:nth-child(1)")
    private WebElement whatsNewMenuText;
    @FindBy(css = "#ui-id-8 > span:nth-child(1)")
    private WebElement saleMenu;
    @FindBy(css = ".category37 > strong:nth-child(1)")
    private WebElement saleMenuText;
    @FindBy(css = "#ui-id-7")
    private WebElement trainingMenu;
    @FindBy(css = ".category9 > strong:nth-child(1)")
    private WebElement trainingMenuText;
    @FindBy(css = "#ui-id-6")
    private WebElement gearMenu;
    @FindBy(css = ".category3 > strong:nth-child(1)")
    private WebElement gearMenuText;
    @FindBy(css = "#ui-id-5")

    private WebElement menMenu;
    @FindBy(css = ".category11 > strong:nth-child(1)")
    private WebElement menMenuText;
    @FindBy(css = "#ui-id-4")
  private WebElement womenMenu;
    @FindBy(css = ".category20 > strong:nth-child(1)")
   private WebElement womenMenuText;

    protected WebDriver driver;

    public MainMenu(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);

    }

    public void MenuTesting() {

        mainSiteLink.click();
        whatsNewMenu.click();
        Assert.assertEquals(whatsNewMenuText.getText(), "What's New");
        womenMenu.click();
        Assert.assertEquals(womenMenuText.getText(), "Women");
        menMenu.click();
        Assert.assertEquals(menMenuText.getText(), "Men");
        gearMenu.click();
        Assert.assertEquals(gearMenuText.getText(), "Gear");
        trainingMenu.click();
        Assert.assertEquals(trainingMenuText.getText(), "Training");
        saleMenu.click();
        Assert.assertEquals(saleMenuText.getText(), "Sale");

    }

    public WebElement getMainSiteLink() {
        return mainSiteLink;
    }

    public WebElement getWhatsNewMenu() {
        return whatsNewMenu;
    }

    public WebElement getWhatsNewMenuText() {
        return whatsNewMenuText;
    }

    public WebElement getSaleMenu() {
        return saleMenu;
    }

    public WebElement getSaleMenuText() {
        return saleMenuText;
    }

    public WebElement getTrainingMenu() {
        return trainingMenu;
    }

    public WebElement getTrainingMenuText() {
        return trainingMenuText;
    }

    public WebElement getGearMenu() {
        return gearMenu;
    }

    public WebElement getGearMenuText() {
        return gearMenuText;
    }

    public WebElement getMenMenu() {
        return menMenu;
    }

    public WebElement getMenMenuText() {
        return menMenuText;
    }

    public WebElement getWomenMenu() {
        return womenMenu;
    }

    public WebElement getWomenMenuText() {
        return womenMenuText;
    }
}
