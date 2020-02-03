package cucum;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class stepdefenetion extends FunctionalLibrary {
	loginpage lp=new loginpage();
	@Given("^User launch the adactin application$")
	public void user_launch_the_adactin_application() throws Throwable {
	    
	    website("https://adactin.com/HotelApp/");
	}

	@Then("^User enter the username in the login module$")
	public void user_enter_the_username_in_the_login_module() throws Throwable {
	    text(lp.getEmailIdFeild(), "PDPKUMAR1996");
	    
	}

	@Then("^User enter the password in the login module$")
	public void user_enter_the_password_in_the_login_module() throws Throwable {
	    text(lp.getPassWordFeild(), "Pradeeppdp1996");
	    
	}

	@Then("^User click on the login button$")
	public void user_click_on_the_login_button() throws Throwable {
	    
	    clickOntheElement(lp.getLoginbutton());
	    Thread.sleep(2000);
	}

	@Then("^User verify the alert message displays for invalid crendentails$")
	public void user_verify_the_alert_message_displays_for_invalid_crendentails() throws Throwable {
	 String elementText = getElementText(lp.getLoginconfirmation());   
	System.out.println(elementText);
	    
	}

}
