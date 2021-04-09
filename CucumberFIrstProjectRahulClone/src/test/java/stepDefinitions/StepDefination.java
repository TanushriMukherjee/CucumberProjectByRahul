package stepDefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefination {
	
	@Given("^User is on netbanking landing page$")
	public void User_is_on_netbanking_landing_page () {
		//Selenium code//appium code
		System.out.println("navigated to login url");
	}
	
	@When("^User login into application with username and password$")
	public void User_login_into_application_with_username_and_password() {
		//Selenium code//appium code
		System.out.println("Logged in success");
	}
		@When("^User login into application with \"([^\"]*)\" and \"([^\"]*)\"$")
	    public void user_login_into_application_with_something_and_something(String strArg1, String strArg2) throws Throwable {
	       
	        System.out.println(strArg1);
	        System.out.println(strArg2);
	    }
	
	
	@Then("^Home page is populated$")
    public void home_page_is_populated() throws Throwable {
		//Selenium code//appium code
		System.out.println("Validated home page");
    }

    @And("^cards are displayed$")
    public void cards_are_displayed() throws Throwable {
    	//Selenium code//appium code
    	System.out.println("cards are displayed");
    }
    
    @And("^cards displayed are \"([^\"]*)\"$")
    public void cards_displayed_are_something(String strArg1) throws Throwable {
        System.out.println(strArg1);
    }

}
