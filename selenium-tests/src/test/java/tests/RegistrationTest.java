package tests;

import org.junit.BeforeClass;
import org.junit.Test;
import pages.HomePage;
import pages.LogInModal;
import pages.RegistrationPage;

public class RegistrationTest extends SeleniumTest {

    private static HomePage homePage;
    private static LogInModal logInModal;
    private static RegistrationPage registrationPage;

    @BeforeClass
    public static void setUpClass(){

        homePage = getPageObjectManager().getHomePage();
        logInModal = getPageObjectManager().getLogInModal();
        registrationPage = getPageObjectManager().getRegistrationPage();
    }

    @Test
    public void registerNewCustomerTest() {

        homePage.registerNewCutomer();
        logInModal.clickOnCreateNewCustomerButton();
        registrationPage.fillInRegistrationForm();
        homePage.logOut();
    }
}
