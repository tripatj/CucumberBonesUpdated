package frameworkClasses;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import cucumber.api.Scenario;
import frameworkClasses.Browser;
import frameworkClasses.BrowserFactory;

public class Hooks {
	
	private static String browser;
	public static WebDriver driver;
		
	public void setWebDriver() {
	
		if (Browser.CHROME.getName().equals( getBrowserType() )) {
			 driver=BrowserFactory.getBrowser(Browser.fromProperty(getBrowserType()));
		}
		
	}
	
	private String getBrowserType() {
		
		browser=TestProperties.getPropertyValue("browser");
		
		return browser;
		
		
	}
	
	public void takeSreenshot(Scenario sce ) {
		final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
		sce.embed(screenshot, "image/png");
	}

}
