package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegistrationPage extends PageObject{

    @FindBy(name = "register.firstname")
    private WebElement firstNameField;
    @FindBy(name = "register.lastname")
    private WebElement lastNameField;
    @FindBy(name = "register.email")
    private WebElement emailAddressField;
    @FindBy(name = "register.password")
    private WebElement passwordField;
    @FindBy(xpath="(//*[@name='register.gender'])[1]")
    private WebElement genderRadioButton;
    @FindBy(name="register.newsletter")
    private WebElement newsletterCheckbox;
    @FindBy(xpath="//*[@data-name='z-coast-reef_register_register']")
    private WebElement registerButton;

    public RegistrationPage(WebDriver driver) {
        super(driver);
    }

    public void fillInRegistrationForm(){

        waitForElementAndSendKeys(firstNameField,"Zuzanna");
        lastNameField.sendKeys("Test");
        emailAddressField.sendKeys("testmail.zalando@gmail.com");
        passwordField.sendKeys("test123");
        genderRadioButton.click();
        newsletterCheckbox.click();
        registerButton.click();
    }
}
