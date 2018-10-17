package stepDefinition;

import com.paras.Selenium_Basics.WindowHandling;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class UIStepdefinition {

public WindowHandling winHandling = new WindowHandling();
	
	
	 @Given("^I am navigated to toolsQA website$")
	  public void I_am_navigated_to_toolsQA_website() {
		 try {
			winHandling.openApplication();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    }
	
	 @Then("^I handle windows on chrome$")
	  public void I_handle_windows_on_chrome() {
		 	try {
				winHandling.handleWindow();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    }
}
