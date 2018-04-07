package tests;

import io.github.bonigarcia.wdm.ChromeDriverManager;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.UnreachableBrowserException;
import pages.PageObjectManager;

public class SeleniumTest {

    private static WebDriver driver;
    private static PageObjectManager pageObjectManager;

    private static final String PAGE_URL = "https://www.zalando.pl/";

    public static PageObjectManager getPageObjectManager() {
        return pageObjectManager;
    }

    @BeforeClass
    public static void setUp() {

        initDriver();
        pageObjectManager = new PageObjectManager(driver);
        driver.get(PAGE_URL);
    }

    private static void initDriver(){

        ChromeDriverManager.getInstance().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        driver = new ChromeDriver(options);
    }
    @AfterClass
    public static void tearDown() {
        driver.quit();;
    }

    public static WebDriver getDriver() {
        return driver;
    }


}
