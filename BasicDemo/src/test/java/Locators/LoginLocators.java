package Locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginLocators {
	public @interface ExampleLocators {

	}

	@FindBy(name = "username")
    public WebElement userName;
  
    @FindBy(name = "password")
    public WebElement password;
     
    @FindBy(xpath = "//span[@class='oxd-text oxd-text--span oxd-input-field-error-message oxd-input-group__message']")
    public WebElement missingUsernameErrorMessage;
     
    @FindBy(xpath = "//button[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']")
    public WebElement login;
  
    @FindBy(xpath = "//div[@class='orangehrm-login-error']//p[@class='oxd-text oxd-text--p oxd-alert-content-text']")
    public  WebElement errorMessage;
}
