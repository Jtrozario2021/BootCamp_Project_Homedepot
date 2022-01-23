package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateNewAccount {
	public WebDriver driver;
	
	@FindBy(xpath = "//input[@id='email']") WebElement Email;
	@FindBy(xpath = "//input[@id='password-input-field']") WebElement Password;
	@FindBy(xpath = "//input[@id='zipCode']") WebElement ZipCode;
	@FindBy(xpath = "//input[@id='phone']") WebElement Phone;
	
	
	public CreateNewAccount(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);		
	}
public void EmailField() {
	Email.sendKeys("asdfasdfsde@dafaf.com");
	}
public void PasswordField() {
	Password.sendKeys("@#2334GHGeegdsf");
}
public void ZipcodeField() {
	ZipCode.sendKeys("20903");
}
public void PhoneField() {
	Phone.sendKeys("4657679876");
}

}
