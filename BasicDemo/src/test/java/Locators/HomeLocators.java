package Locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomeLocators {
	 @FindBy(xpath = "//div[@class='oxd-table-filter-header-title']//h5[@class='oxd-text oxd-text--h5 oxd-table-filter-title']")
     public  WebElement homePageUserName;
}
