Feature: This feature will validate create customer scenario

  Scenario Outline: Validate create customer api using valid data
    Given I provide a valid auth key
    When I enter valid email "<email>"
    And I enter valid description "<description>"
    And I send a post request to "<endpoint>"
    Then A new customer should get created
    And The email in the response should be "<expectedEmail>"
    And The description in the response should be "<expectedDescription>"
    And The Status code of the response should be "<statusCode>"

    Examples: 
      | email            | description              | endpoint   | expectedEmail    | expectedDescription      | statusCode |
      | pranay@yahoo.com | This is test description | /customers | pranay@yahoo.com | This is test description |        200 |
