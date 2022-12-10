package Test;

import PageObjects.MainMenu;
import org.testng.annotations.Test;

public class TestMenu extends TestBase {
    @Test
    public void mainMenuTest() {
        MainMenu mainMenu = new MainMenu(driver);

        mainMenu.MenuTesting();
    }
}
