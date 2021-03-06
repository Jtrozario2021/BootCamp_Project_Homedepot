package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Register {
	public WebDriver driver;
	
	@FindBy(id = "SPSORegister") WebElement RegisterButton;
	
	public Register(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
public void ClickRegisterButton() {
	RegisterButton.click();
}
}
