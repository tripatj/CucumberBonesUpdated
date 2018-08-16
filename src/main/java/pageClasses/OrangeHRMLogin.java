package pageClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import frameworkClasses.GenericUtils;
import frameworkClasses.Hooks;

public class OrangeHRMLogin extends GenericUtils {
	
	WebDriver driver;
	//Hooks hk= new Hooks();
			
	public OrangeHRMLogin() {
				this.driver = super.driver;		
				PageFactory.initElements(driver, this);
			}
			
	@FindBy(id="txtUsername")
 	WebElement userName;
	
	@FindBy(id="txtPassword")
	WebElement pwd;
	
	@FindBy(id="btnLogin")
	WebElement btn;
	
		public void launchURL(String url) throws InterruptedException {		
			driver.get(url);	
			Thread.sleep(2000);
			driver.manage().window().maximize();
		 }
	
		public void loginToOrangeHRM(String UserName, String PWD) throws InterruptedException {			
			userName.clear();
			Thread.sleep(1000);
			userName.sendKeys(UserName);
			
			pwd.clear();
			Thread.sleep(1000);
			pwd.sendKeys(PWD);
			
			btn.click();
			
		}
 
	
}
