package stepDefS;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import pageClasses.OrangeHRMLogin;

public class StepDefs {
	
	
	   @Given("^User Launch Orange HRM URL$")
	    public void user_launch_orange_hrm_url() throws Throwable {
		   
	        String url="https://orangehrm-demo-6x.orangehrmlive.com/auth/login";
	        
	        	new OrangeHRMLogin().launchURL(url);
		   
	    }

	   @When("^User enters userName and pawssword and click Login button$")
	    public void user_enters_username_and_pawssword_and_click_login_button() throws Throwable {
	   
	    	new OrangeHRMLogin().loginToOrangeHRM("admin", "admin123");
	    
	    }

}
