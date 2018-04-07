package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LogInModal extends PageObject{

    public LogInModal(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "a[href='/login/?view=register']")
    private WebElement newCutomerButton;

    public void clickOnCreateNewCustomerButton(){

        waitForElementAndClick(newCutomerButton);
    }

}
