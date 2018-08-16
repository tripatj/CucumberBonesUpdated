package stepDefS;

import org.openqa.selenium.WebDriver;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import frameworkClasses.*;

public class Annotations extends Hooks {
	
	//WebDriver driver;
	
	@Before
	public void before(Scenario sce) {
		
		testConfigSetup();
		setWebDriver();	
		
	}
	
	@After
	public void after(Scenario sce) {	
		
		takeSreenshot(sce);
		driver.getTitle();
		driver.quit();
		
	}
	
	public void testConfigSetup() {		
		TestProperties.loadDefaultProperty();
		
	}
	

}
