package pages;

import com.google.common.base.Predicate;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitExecutor {

    private static final int ELEMENT_WAIT_TIMEOUT_IN_SECONDS = 15;

    private final WebDriver driver;

    public WaitExecutor(WebDriver driver) {
        this.driver = driver;
    }

    protected WebDriver getDriver() {
        return driver;
    }

    public void waitForElementToBeDisplayed(WebElement element) {

        performWait(ExpectedConditions.visibilityOf(element));
    }

    public void waitForElementToBeClickable(WebElement element) {

        performWait(ExpectedConditions.elementToBeClickable(element));
    }

    public <T> void waitForElement(ExpectedCondition<T> condition) {

        performWait(condition);
    }

    private <T> void performWait(ExpectedCondition<T> condition) {

        performWait(condition, ELEMENT_WAIT_TIMEOUT_IN_SECONDS);
    }

    private <T> void performWait(ExpectedCondition<T> condition, int timeoutInSeconds) {

        WebDriverWait wait = new WebDriverWait(getDriver(), timeoutInSeconds);
        wait.until(condition);
    }

    public void waitForElementAndClick(WebElement element) {

        waitForElementToBeClickable(element);
        element.click();
    }

    public void waitForElementAndSendKeys(WebElement element, String text) {

        waitForElementToBeClickable(element);
        element.clear();
        element.sendKeys(text);
    }


}
