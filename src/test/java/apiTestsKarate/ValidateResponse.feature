@API_tests
Feature: API Tests

  Background: 
    * header Accept = 'application/json'

  @GET_tests
  Scenario: Validate GET Response
    Given url 'https://api.tmsandbox.co.nz/v1/Categories/6327/Details.json?catalogue=false'
    When method GET
    Then status 200
    And match response.Name == 'Carbon credits'
    And match response.CanRelist == true
    And match response.Promotions[1].Name == 'Gallery'
    And match response.Promotions[1].Description == 'Good position in category'