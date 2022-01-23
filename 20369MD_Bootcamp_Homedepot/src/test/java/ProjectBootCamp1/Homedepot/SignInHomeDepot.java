package ProjectBootCamp1.Homedepot;

import org.testng.annotations.Test;

import PageObjects.AccountPage;
import PageObjects.CreateNewAccount;
import PageObjects.HomePage;
import PageObjects.Register;

import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class SignInHomeDepot {
	public WebDriver driver;
	
  @Test
  public void f() {
	  HomePage ob = new HomePage(driver);
	  ob.ClickToMyAccount();
	  
	  Register btn = new Register(driver);
	  btn.ClickRegisterButton();
	  
	  AccountPage btn1 = new AccountPage(driver);
	  btn1.ClickRegisterButton();
	  
	  CreateNewAccount it = new CreateNewAccount(driver);
	  it.EmailField();
	  it.PasswordField();
	  it.ZipcodeField();
	  it.PhoneField();
		 
  }
  @BeforeMethod
  public void beforeMethod() {
	  String local = System.getProperty("user.dir");
	  System.setProperty("webdriver.chrome.driver", local+"\\src\\Driver\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.navigate().to("http://www.homedepot.com/");
	  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	  driver.manage().window().maximize();
	  driver.manage().deleteAllCookies();
	  
  }

  @AfterMethod
  public void afterMethod() throws InterruptedException {
	  Thread.sleep(10000);
	  driver.quit();
  }

}
