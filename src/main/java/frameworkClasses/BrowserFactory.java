package frameworkClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserFactory {
	
	static WebDriver driver;
	
	public static WebDriver getBrowser(Browser browser) {
		
		switch (browser) {
		
		case CHROME:
			return getChromeDriver();
			
		default:
			return getChromeDriver();
		}
	}
	
	public static WebDriver getChromeDriver () {
		
		String path=TestProperties.getPropertyValue("driver.chrome.path");
		
		System.setProperty("webdriver.chrome.driver",path);
		
		driver = new ChromeDriver();
		
		return driver;
		
	}

}
