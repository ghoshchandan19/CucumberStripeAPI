Feature:Validate Create Customer API
 This feature file have scenarios to test customer API
 
 Scenario: Validate Create Customer API with valid email and description
 
 Given I set the auth key for Create Customer API
 When I pass "cgmrcool@gmail.com" as the email
 And I pass "sample description" as description
 And I send  a "post" request to customer api
 Then I should be able to create a new customer
 And The email id in response should match
 
 Scenario: Validate Create Customer API with Invalid email and Invalid description
 
 Given I set the auth key for Create Customer API
 When I pass "12344" as the email
 And I pass "sample description" as description
 And I send  a "post" request to customer api
 Then I should be able to create a new customer
 And The email id in response should match
 And I should get customer ID