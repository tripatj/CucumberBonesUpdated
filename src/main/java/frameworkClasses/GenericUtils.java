package frameworkClasses;

import org.openqa.selenium.WebDriver;
import cucumber.api.Scenario;

public class GenericUtils {
	
	public WebDriver driver;
	public Scenario reporter;
	
	public GenericUtils () {
		this.driver = Hooks.driver;	
	}
	
	

}
