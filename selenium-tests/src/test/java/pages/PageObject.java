package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class PageObject extends WaitExecutor {

    private static final String JS_SCROLL_UP = "scroll(0, -250);";
    private static final String JS_SCROLL_DOWN = "scroll(0, 250);";

    private final Actions actions;


    public PageObject(WebDriver driver) {
        super(driver);
        this.actions = new Actions(driver);
    }

    public Actions getActions() {
        return actions;
    }
    public Object executeJavascript(String script) {

        return executeJavascriptForElement(null, script);
    }

    public Object executeJavascriptForElement(WebElement element, String script) {

        org.openqa.selenium.JavascriptExecutor executor = (org.openqa.selenium.JavascriptExecutor) getDriver();
        if (element != null) {
            return executor.executeScript(script, element);
        } else {
            return executor.executeScript(script);
        }
    }

    public void scrollDown() {

        executeJavascript(JS_SCROLL_DOWN);
    }

    public void scrollUp() {

        executeJavascript(JS_SCROLL_UP);
    }
}
