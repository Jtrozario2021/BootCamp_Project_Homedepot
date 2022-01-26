
package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountPage {
public WebDriver driver;
	
	@FindBy(xpath = "//body/div[@id='single-signin']/div[@id='outer']/div[@id='single-signin__body']/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[4]/button[1]/span[1]") WebElement PersonalAccBtn;
	
	public AccountPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
public void ClickRegisterButton() {
	PersonalAccBtn.click();
	
}
}


