package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import sun.rmi.runtime.Log;

public class PageObjectManager {

    private final WebDriver driver;
    private HomePage homePage;
    private LogInModal logInModal;
    private RegistrationPage registrationPage;

    public PageObjectManager(WebDriver driver) {
        this.driver = driver;
    }

    public HomePage getHomePage() {
        if (homePage == null) {
            homePage = PageFactory.initElements(driver, HomePage.class);
        }
        return homePage;
    }

    public LogInModal getLogInModal() {
        if (logInModal == null) {
            logInModal = PageFactory.initElements(driver, LogInModal.class);
        }
        return logInModal;
    }

    public RegistrationPage getRegistrationPage(){
        if(registrationPage==null){
            registrationPage=PageFactory.initElements(driver,RegistrationPage.class);
        }
        return registrationPage;
    }
}
