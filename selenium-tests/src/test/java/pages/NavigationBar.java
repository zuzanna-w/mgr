package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public abstract class NavigationBar extends PageObject {

    public NavigationBar(WebDriver driver) {
        super(driver);
    }

    @FindBy(className = "z-navicat-header_navToolLabel")
    private WebElement accountButton;
    @FindBy(xpath="//*[@class='z-navicat-header_userAccountLogoutW']")
    private WebElement logOutButton;

    public void openAccountPage() {

       waitForElementAndClick(accountButton);
    }

    public void logOut(){

        waitForElementToBeDisplayed(accountButton);
        getActions().moveToElement(accountButton).build().perform();
        waitForElementAndClick(logOutButton);
    }

}
