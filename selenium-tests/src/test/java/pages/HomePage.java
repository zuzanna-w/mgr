package pages;

import org.openqa.selenium.WebDriver;

public class HomePage extends NavigationBar {

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void registerNewCutomer() {

        openAccountPage();
    }
}
