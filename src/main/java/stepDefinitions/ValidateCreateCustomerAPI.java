package stepDefinitions;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import testSetup.TestSetup;

public class ValidateCreateCustomerAPI extends TestSetup {

	public static RequestSpecification requestSpecification;
	Response response;
	JsonPath jsonResponse;

	@Given("^I provide a valid auth key$")
	public void i_provide_a_valid_auth_key() throws Throwable {
		requestSpecification =given().auth().basic("sk_test_XPbhuUljR0FL1uTrfqagOIcP","");
		System.out.println(requestSpecification);

	}

	@When("^I enter valid email \"([^\"]*)\"$")
	public void i_enter_valid_email(String email) throws Throwable {
		requestSpecification=requestSpecification.formParam("email", email);
	}

	@When("^I enter valid description \"([^\"]*)\"$")
	public void i_enter_valid_description(String description) throws Throwable {
		requestSpecification=requestSpecification.formParam("description", description);
	}

	@When("^I send a post request to \"([^\"]*)\"$")
	public void i_send_a_post_request_to(String endpoint) throws Throwable {
		response =requestSpecification.when().post(endpoint).then().extract().response();
		jsonResponse = response.jsonPath();
	}

	@Then("^A new customer should get created$")
	public void a_new_customer_should_get_created() throws Throwable {
		Assert.assertNotNull(jsonResponse.get("id"));
	}

	@Then("^The email in the response should be \"([^\"]*)\"$")
	public void the_email_in_the_response_should_be(String expectedEmail) throws Throwable {
		Assert.assertEquals(jsonResponse.get("email"), expectedEmail);
	}

	@Then("^The description in the response should be \"([^\"]*)\"$")
	public void the_description_in_the_response_should_be(String expectedDescription) throws Throwable {
		Assert.assertEquals(jsonResponse.get("description"),expectedDescription);
	}

	@Then("^The Status code of the response should be \"([^\"]*)\"$")
	public void the_Status_code_of_the_response_should_be(String statusCode) throws Throwable {
		Assert.assertEquals(response.statusCode(),
		Integer.parseInt(statusCode));
	}

}
