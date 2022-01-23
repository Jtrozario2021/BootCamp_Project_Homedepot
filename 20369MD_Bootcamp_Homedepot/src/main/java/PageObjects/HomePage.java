package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	public WebDriver Driver;
	
	@FindBy(id = "headerMyAccountTitle") WebElement MyAccount;
	
public HomePage(WebDriver driver) {
	this.Driver=driver;
	PageFactory.initElements(driver, this);
}	
public void ClickToMyAccount() {
	MyAccount.click();
}

}