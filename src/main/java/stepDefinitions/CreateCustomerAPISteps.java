package stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CreateCustomerAPISteps {
	
	
	
	@Given("^I set the auth key for Create Customer API$")
	public void i_set_the_auth_key_for_Create_Customer_API() throws Throwable {
		
		System.out.println("I set the auth");
	    
	}

	@When("^I pass \"([^\"]*)\" as the email$")
	public void i_pass_as_the_email(String arg1) throws Throwable {
		System.out.println("I entered email");
	}

	@When("^I pass \"([^\"]*)\" as description$")
	public void i_pass_as_description(String arg1) throws Throwable {
		System.out.println("I entered description");
	}

	@When("^I send  a \"([^\"]*)\" request to customer api$")
	public void i_send_a_request_to_customer_api(String arg1) throws Throwable {
		System.out.println("I posted request");
	   
	}

	@Then("^I should be able to create a new customer$")
	public void i_should_be_able_to_create_a_new_customer() throws Throwable {
		System.out.println("I am Able to create customer");
		   
	   
	}

	@Then("^The email id in response should match$")
	public void the_email_id_in_response_should_match() throws Throwable {
		System.out.println("The email id matches");
		   
	    
	}
	@Then("^I should get customer ID$")
	public void i_should_get_customer_ID() throws Throwable {
	   
	}



}
