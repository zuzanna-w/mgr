package tests;

import org.junit.BeforeClass;
import org.junit.Test;
import pages.HomePage;
import pages.LogInModal;

public class LogInTest extends SeleniumTest {

    private static HomePage homePage;
    private static LogInModal logInModal;

    @BeforeClass
    public static void setUpClass() {

        homePage = getPageObjectManager().getHomePage();
        logInModal = getPageObjectManager().getLogInModal();
    }
    @Test
    public static void logInTest(){



    }

}
