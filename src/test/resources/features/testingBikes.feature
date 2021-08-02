Feature: Testing public bikes API

  @wip
  Scenario: Testing cities and countries
    Given I am on bikes api
    When I send a get request
    Then Status code must be 200