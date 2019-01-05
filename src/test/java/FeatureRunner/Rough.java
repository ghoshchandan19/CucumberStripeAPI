
package FeatureRunner;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Rough {
	Response response;
	

	@Test
	public void test() {
		
		response = given().auth().basic("sk_test_XPbhuUljR0FL1uTrfqagOIcP", " ")
				// given()
				// .auth().basic("sk_test_XPbhuUljR0FL1uTrfqagOIcP"," ")
				.when().get("https://api.stripe.com/v1/customers/cus_DdTb5mEN82JUmn").then().extract().response();

		System.out.println(response.getStatusCode());
		System.out.println(response.asString());

	}

}
